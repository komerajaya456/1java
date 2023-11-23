//package com.tapacad.linkedlist;
public class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		}
}

public static void printLinkedlist(Node head){
			Node current=head;
			while (current != null){
				System.out.println(current.data);
				current=current.next;
			
			
			}
			
	
	
	}




class Linkedlist_node{
	public static void main(String[] args) {
		Node p1=new Node(10);
		Node p2=new Node(20);
		Node p3=new Node(30);
		Node p4=new Node(40);
		
		Node head=p1;
		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		
		
		
				
	}
}