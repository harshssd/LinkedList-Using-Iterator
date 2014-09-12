package com.hhh.test.linkedlist_using_iterator;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.hhh.linkedlist_using_iterator.LinkedList;

public class LinkedListTest {

	LinkedList<Integer> list;
	
	@Before
	public void setUp() throws Exception {
		list = new LinkedList<Integer>();
	}

	@Test
	public void addTest() {
		list.add(0);list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);list.add(6);list.add(7);
		assertTrue(list.getLength()==8);
	}

	@Test
	public void iteratorHasNextTestPositive() {
		list.add(0);list.add(1);list.add(2);list.add(3);
		Iterator<Integer> it = list.iterator();
		assertTrue(it.hasNext()==true);
	}
	@Test
	public void iteratorHasNextTestNegative() {
		list.add(0);list.add(1);list.add(2);list.add(3);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			it.next();
		}
		assertTrue(it.hasNext()==false);
	}
	
	@Test
	public void iteratorNextTestPositive() {
		list.add(0);list.add(1);list.add(2);list.add(3);
		Iterator<Integer> it = list.iterator();
		it.next();it.next();
		assertTrue(it.next()==2);
	}
	
	@Test
	public void iteratorRemoveTestPositive() {
		list.add(0);list.add(1);list.add(2);list.add(3);
		Iterator<Integer> it = list.iterator();
		it.next();it.next();it.remove();
		assertTrue(it.next()==3 && list.getLength()==3);
	}
}
