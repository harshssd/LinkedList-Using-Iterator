package com.hhh.linkedlist_using_iterator;

public class Node<T> {

	Node<T> next;
	T data;
	
	public Node(T d) {
		this.next = null;
		this.data = d;
	}
	
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
