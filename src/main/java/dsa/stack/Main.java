package dsa.stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println("empty? " + stack.isEmpty());
        System.out.println("size? " + stack.size());

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("peek: " + stack.peek());

        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println("size: " + stack.size());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println("empty? " + stack.isEmpty());
    }

}