package dsa.stack;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        values = new ArrayList<>();
    }

    // O(1)
    public void push(String value) {
        values.add(value);
    }

    // O(1)
    public String pop() {
        if (values.isEmpty()) {
            return null;
        }
        return values.remove(values.size() - 1);
    }

    // O(1)
    public String peek() {
        if (values.isEmpty()) {
            return null;
        }
        return values.get(values.size() - 1);
    }

    // O(1)
    public boolean isEmpty() {
        return values.isEmpty();
    }

    // O(1)
    public int size() {
        return values.size();
    }

}