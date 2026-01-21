package dsa.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        System.out.println("empty? " + list.isEmpty());
        System.out.println("size? " + list.size());

        list.addFirst("B");
        list.addFirst("A");
        list.addFirst("C");
        list.addFirst("D");

        list.print();

        System.out.println("contains B? " + list.contains("B"));
        System.out.println("contains X?" + list.contains("X"));
        System.out.println("size: " + list.size());

        System.out.println("remove C? " + list.remove("C"));
        list.print();
        
        System.out.println("remove D? " + list.remove("D"));
        list.print();

        System.out.println("remove X? " + list.remove("X"));
        list.print();

        System.out.println("size: " + list.size());



    }
    
}
