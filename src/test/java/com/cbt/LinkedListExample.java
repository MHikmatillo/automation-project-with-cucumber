package com.cbt;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		//Linked List Declaraiton
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Murodil");
		linkedList.add("Maruf");
		linkedList.add("Kuzzat");
		linkedList.add("Shaun");
		linkedList.add("Akbar");
		
		//Display Linked List Content
		System.out.println("LinkedList Content: "+ linkedList);
		
		//Add First and Last Element
		
		linkedList.addFirst("Hikmatillo");
		linkedList.addLast("Hikmatillo");
		System.out.println("LinkedList Content after addition: "+linkedList);
		
		// This is how to get and set Values
		Object firstvar=linkedList.get(0);
		System.out.println("First element: "+firstvar);
		
		linkedList.set(0, "Hikmatilo");
		Object firstvar2=linkedList.get(0);
		System.out.println("First element after update by set method "+ firstvar2);
		
		//Remove first and last element
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("LinkedList after deletion of first and last element: \n"+linkedList);

		//Add position and remove from position
		linkedList.add(0, "Hikmatillo");
		linkedList.remove(2);
		System.out.println("Final Content "+linkedList);
	}


}
