package com.hhh.linkedlist_using_iterator;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	private Node<T> head;
	private int length;
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public int getLength() {
		return length;
	}

	public void incLength() {
		++this.length;
	}
	
	public void decLength() {
		--this.length;
	}

	@Override
	public Iterator<T> iterator() {
		return new CustomIterator<>(this);
	}

	public boolean add(T d) {
		Node<T> newNode = new Node<T>(d);
		if(getHead()==null){
			this.setHead(newNode);
		} else {
			Node<T> current = getHead();
			while(current.getNext()!=null){
				current=current.getNext();
			}
			current.setNext(newNode);
		}
		incLength();
		return true;
	}
	
	public boolean remove(T d){
		if(getHead().getData()==d){
			setHead(getHead().getNext());
			decLength();
			return true;
		}
		
		Node<T> current = getHead().next;
		Node<T> previous = getHead();
		
		while(current!=null){
			if(current.getData() == d){
				previous.setNext(current.getNext());
				decLength();
				return true;
			}
			current = current.getNext();
			previous = previous.getNext();
		}
		return false;
	}
	
	public boolean contains(T d) {
		Node<T> current = getHead().next;
		while(current!=null){
			if(current.getData() == d)
				return true;
			current = current.getNext();
		}
		return false;
	}
	
}
