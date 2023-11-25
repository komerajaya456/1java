class Myqueue{
 static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
                  }
           }
     
   static class Linklistqueue{
     static Node front,rear;
      //enqueue== push
     static void enqueue(int data){
        Node newnode=new Node(data);
        if (front==null){
          front = newnode;
          rear = newnode;}
          //System.out.println(front);}
        else{
          rear.next=newnode;
          rear = newnode;
           }
        
      }
      
      
      
      
      
      //dequeue == pop
      static int dequeue(){
       int data = front.data;
        if (front==null){
          return 100;
        }
        
        front=front.next;
        return data;
                }
                
            
    }
     
     
           
           
           
    public static void main(String[] args){
      
      Linklistqueue queue=new Linklistqueue();
      queue.enqueue(0);
      queue.enqueue(1);
      queue.enqueue(2);
      System.out.println(queue.front.data);
      System.out.println(queue.dequeue());
      System.out.println(queue.front.data);
    }
  
  
  
  
  
  
}