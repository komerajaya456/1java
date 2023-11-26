public class Mystack{
  
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=next;
                }
                        }
                        
  public  static class Linkliststack{                     
    static Node top;                    
    
    public static void push(int data){
      Node newnode=new Node(data);
      if (top==null){
        top=newnode;}
      else{top.next=newnode;top=newnode;}
    }
      
      public static int pop(){
        int data=top.data;
        top=top.next;
        return data;
      }
      
      public static int peekval(){
        return top.data;
      }
  
  
  
  }
  
  public static void main(String[] args){
    Linkliststack stack=new Linkliststack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.top.data);
    System.out.println(stack.pop());
  //  System.out.println(stack.top.data);
    stack.push(4);
    System.out.println(stack.top.data);
    
    
  }
}