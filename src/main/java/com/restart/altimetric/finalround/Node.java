package com.restart.altimetric.finalround;

import java.util.function.Consumer;

public class Node {

	int data;
	Node next;

	Node(int data) {

		this.data = data;
		this.next = null;
	}

}

class LinkedList {

	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}

	}

	public void display() {
		Consumer<Node> print = node -> System.out.println(node.data + "-> ");

		Node temp = head;
		while (temp != null) {
			print.accept(temp);
			temp = temp.next;

		}
		// System.out.println("null");

	}

	public void removeDuplicates() {
		Node current = head;

		while (current != null && current.next != null) {
			Node runner = current;

			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}

			current = current.next;
		}

	}

}
