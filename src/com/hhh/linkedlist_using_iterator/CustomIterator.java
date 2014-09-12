package com.hhh.linkedlist_using_iterator;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

	private Node<T> current;
	private Node<T> previous;
	private LinkedList<T> list;
 	
	public CustomIterator(LinkedList<T> list) {
		this.current = new Node<T>(list.getHead().getData());
		this.current.setNext(list.getHead());
		this.previous = null;
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return current.getNext()!=null;
	}

	@Override
	public T next() {
		previous = current;
		current = current.getNext();
		return current.getData();
	}

	@Override
	public void remove(){
//		Removes from the underlying collection the last element returned by this 
//		iterator (optional operation). This method can be called only once per call to next().
		if(previous == null || current == null)
//			if the next method has not yet been called, or the remove method 
//			has already been called after the last call to the next method
			throw new IllegalStateException();
		else {
			previous.setNext(current.getNext());
			current = previous.getNext();
			this.list.decLength();
		}
	}

}
