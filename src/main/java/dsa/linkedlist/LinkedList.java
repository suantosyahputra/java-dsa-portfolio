package dsa.linkedlist;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    //O(1)

    public int size(){
        return size;
    }

    //O(1)
    public boolean isEmpty(){
        return size == 0;
    }

    //O(1)
    public void addFirst(String value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
        
        

    }

    //O(n)
    public void addLast(String value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

    //O(n)

    public boolean contains(String value){
        Node current = head;
        while (current != null){
            if (current.value.equals(value)) {
                return true;
            }

            current = current.next;

        }

        return false;
    }

    //O(n)

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public boolean remove(String value){
        if (head == null){
            return false;
        }

        if (head.value.equals(value)){
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.value.equals(value)){
                current.next = current.next.next;
                size--;
                return true;

            }

            current = current.next;
        }

        return false;

    }

    //O(n)
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    // O(n)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

}
