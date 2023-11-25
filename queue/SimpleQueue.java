class SimpleQueue {
    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node front;
    private static Node rear;

    public SimpleQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
            
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return null; // or throw an exception
        }

        String data = front.data;
        front = front.next;
        // if (front == null) {

        //     rear = null;
        // }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
    
    public static void main(String[] args){    SimpleQueue queue = new SimpleQueue();

       // queue.enqueue("Element 1");
  //      queue.enqueue("Element 2");
        //queue.enqueue("Element 3");

    //    System.out.println(queue.front);
        
     //   System.out.println(front.next.data);
     //   System.out.println(rear.data);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());}
}    