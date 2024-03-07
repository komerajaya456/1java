//package com.tapacad.linkedlist;
public class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		}
}

class Linkedlist{
	Node head;
	
	void printLinkedlist(){
			Node current=this.head;
			while (current != null){
				System.out.print(" ");
			
				System.out.print(current.data);
				current=current.next;
													}	
																}

								}


class Linkedlist_node{
	
	
	public static void main(String[] args) {
		Node p1=new Node(2);
		Node p2=new Node(7);
		Node p3=new Node(4);
		Node p4=new Node(3);
		Node p5=new Node(5);
		
		Node jk=new Node(0);	
		
		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		
		Linkedlist llobj=new Linkedlist();
		llobj.head=p1;
		llobj.printLinkedlist();
		
		
		
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");
			
		
	
			
		
		Node hed=p1;
		Node our=null;
		while (hed != null){
			
			Node asum=hed; //10
		//	Node hed=hed;	//10
			while (asum != null){
			
				if (hed.data < asum.data){ 
				our=asum;
				//if (asum.next==null){our=jk;}
				break;
				}
				else if(hed.data == asum.data || asum.next==null){
					our=jk;
					
					
				}
				
				
			asum=asum.next;
			
			}
			
			System.out.print(" ");
			
			System.out.print(our.data);
			
			
			hed=hed.next;
			
			}
		
			
		
			
								
	}
}








