


public class linklist2 {

    static Node create_linklist(int array[]){
        Node head=new Node(array[0]);
        Node tail=head;
        for(int i=1;i<array.length;i++){
            
            Node newnode=new Node(array[i]);
            tail.next=newnode;
            tail=newnode;
        }
        return head;
    }

    static void print_linklist(Node head){
        while (head != null){
            System.out.println(head.data);
            head=head.next;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3};
        print_linklist(create_linklist(arr));

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

