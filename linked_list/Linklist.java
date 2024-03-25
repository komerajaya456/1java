
public class Linklist{
    public static void main(String[] args){
        Node v1=new Node(10);
        Node v2=new Node(20);
        Node v3=new Node(30);
        Node v4=new Node(40);
        Node v5=new Node(50);
        
        Node head=v1;
        v1.next=v2;
        v2.next=v3;
        v3.next=v4;
        v4.next=v5;



        for(int i=0;i<5;i++){
            System.out.print(head.data+" ");//prints 10,20,30,40,50
            head=head.next;
        }
    
    }

    
    

}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }   
    
    
}

