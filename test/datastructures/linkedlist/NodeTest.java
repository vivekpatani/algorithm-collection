package datastructures.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NodeTest<E> {

	Node<Integer> newNodeWithoutData;
	Node<Integer> newNodeWithData;
	
	@Before
	public void setUp(){
		newNodeWithoutData = new Node<Integer>();
		newNodeWithData = new Node<Integer>(12);
	}
	
	@Test
	public void checkingDataWithInitValue() {
		
		int actual = newNodeWithData.getData();
		int expected = 12;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkingDataWithoutInitValue() {
		
		newNodeWithoutData.setData(12);
		int actual = newNodeWithoutData.getData();
		int expected = 12;
		
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() {
		newNodeWithData = null;
		newNodeWithoutData = null;
	}
	

}
