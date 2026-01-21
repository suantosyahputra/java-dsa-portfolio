package dsa.queue;

import java.util.LinkedList;

public class Queue{
    private LinkedList<String> values;

    public Queue(){
        this.values = new LinkedList<>();

    }
    //O(1)
    public boolean isEmpty() {
        return values.isEmpty();
    }

    //O(1)
    public int size(){
        return values.size();
    }

    //O(1)
    public void enqueue(String value) {
        values.addLast(value);
    }

    //O(1) - return null if empty
    public String dequeue() {
        if (values.isEmpty()) {
            return null;
        }
        return values.removeFirst();
    }

    //O(1) - see the front element without deleting

    public String peek() {
        if(values.isEmpty()){
            return null;
        }
        return values.getFirst();
    }

    //helper for demo/debug

    public LinkedList<String> values(){
        return new LinkedList<>(values);
    }
}