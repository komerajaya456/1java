import java.util.Arrays;  

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		}
	}

	


class Arraylinkedlist {
	
	
	
	static int linklistlength(Node node){
		
		if (node == null){return 0;}
		
		return 1+linklistlength(node.next);
		
		}
	
	
	
	
	
	
	
	static void print(Node head){
		Node current=head;
		while (current != null){
			System.out.print(" ");
			System.out.print(current.data);
			current=current.next;
			}
		
		
		}
		
		
	static Node arrlinklist(int arr[]){
		Node tail=null;
		Node head=null;
		for (int i=0;i<arr.length;i++){
			if (i==0){head=new Node(arr[i]);tail=head;}
			else{
				tail.next=new Node(arr[i]);
				tail=tail.next;
				
				}
				
			}	
		
		return head;	
		}	
	
	
	
	
public static void main(String[] args) {
		
		int  arr[]={1,2,4,3,4,5,5,5,5,5};
		
		Node x=arrlinklist(arr);
		System.out.println(linklistlength(x));
	
	}
}






				//if (i==0){Node head=new Node(arr[i])}