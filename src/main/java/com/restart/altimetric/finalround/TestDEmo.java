package com.restart.altimetric.finalround;

public class TestDEmo {
//create a LinkedList and print the list and  remove the duplicates without using any utils.
// insert display and remove duplicates

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(10);
		list.insert(30);
		list.insert(20);

		System.out.println("origenal list : ");
		list.display();

		list.removeDuplicates();
		System.out.println("after Removing duplicates : ");
		list.display();

	}

}
