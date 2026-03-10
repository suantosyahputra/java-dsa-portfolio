package dsa.hashmap;

public class HashMap {

    private Entry[] buckets;
    private int capacity = 10;

    public HashMap() {
        buckets = new Entry[capacity];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // put key-value
    public void put(String key, int value) {

        int index = hash(key);

        Entry head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
    }

    // get value
    public Integer get(String key) {

        int index = hash(key);

        Entry current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    // remove key
    public boolean remove(String key) {

        int index = hash(key);

        Entry current = buckets[index];
        Entry prev = null;

        while (current != null) {

            if (current.key.equals(key)) {

                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }

                return true;
            }

            prev = current;
            current = current.next;
        }

        return false;
    }

}