package com.hhh.linkedlist_using_iterator;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

	private Node<T> head;
	private Node<T> last;
	private int length;
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	private Node<T> getLast() {
		return last;
	}

	private void setLast(Node<T> last) {
		this.last = last;
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

	public void add(T d) {
		Node<T> newNode = new Node<T>(d);
		if(getHead()==null){
			this.setHead(newNode);
			this.setLast(newNode);
		} else {
			this.getLast().setNext(newNode);
			this.setLast(getLast().getNext());
		}
		incLength();
	}
	
}
