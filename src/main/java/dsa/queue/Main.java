package dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("empty? " + q.isEmpty());
        System.out.println("size? " + q.size());
        System.out.println("peek? " + q.peek());

        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        System.out.println("values: " + q.values());
        System.out.println("empty? " + q.isEmpty());
        System.out.println("size: " + q.size());
        System.out.println("peek: " + q.peek());

        System.out.println("deq: " + q.dequeue());
        System.out.println("deq: " + q.dequeue());
        System.out.println("values: " + q.values());
        System.out.println("deq: " + q.dequeue());
        System.out.println("deq: " + q.dequeue());
        System.out.println("empty? " + q.isEmpty());
    }
    
}
