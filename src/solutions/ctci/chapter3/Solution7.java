package solutions.ctci.chapter3;

import java.util.LinkedList;

public class Solution7 {

	private static LinkedList<String> animalQueue;
	
	public static void main(String[] args) {
		
		animalQueue = new LinkedList<>();
		animalQueue.add("Dog");
		animalQueue.add("Pig");
		animalQueue.add("Dog");
		animalQueue.add("Cat");
		animalQueue.add("Cat");
		animalQueue.add("Elephant1");
		
		System.out.println(dequeueAny());
		System.out.println(animalQueue);
		System.out.println(dequeueDog());
		System.out.println(animalQueue);
		System.out.println(dequeueCat());
		System.out.println(animalQueue);
		System.out.println(dequeueCat());
		System.out.println(animalQueue);
		System.out.println(dequeueCat());
		System.out.println(animalQueue);
	}
	
	public static String dequeueAny () {
		return animalQueue.removeFirst();
	}
	
	public static String dequeueDog () {
		
		for (int i = 0; i < animalQueue.size(); i++) {
			if (animalQueue.get(i).toLowerCase().equals("dog")) {
				String temp = animalQueue.get(i);
				animalQueue.remove(i);
				return temp;
			}
		}
		return null;
	}
	
	public static String dequeueCat () {
		
		for (int i = 0; i < animalQueue.size(); i++) {
			if (animalQueue.get(i).toLowerCase().equals("cat")) {
				String temp = animalQueue.get(i);
				animalQueue.remove(i);
				return temp;
			}
		}
		return null;
	}
}
