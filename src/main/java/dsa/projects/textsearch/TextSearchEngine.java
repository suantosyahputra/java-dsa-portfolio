package dsa.projects.textsearch;

import java.util.*;

public class TextSearchEngine {

    private Map<String, List<String>> index;

    public TextSearchEngine() {
        index = new HashMap<>();
    }

    public void addDocument(Document doc) {

        String text = doc.getContent().toLowerCase();
        String[] words = text.split("\\W+");

        for (String word : words) {

            if (word.isEmpty()) continue;

            index.putIfAbsent(word, new ArrayList<>());
            index.get(word).add(doc.getId());
        }
    }

    public List<String> search(String word) {

        word = word.toLowerCase();

        if (index.containsKey(word)) {
            return index.get(word);
        }

        return Collections.emptyList();
    }

    public void printIndex() {

        for (String word : index.keySet()) {
            System.out.println(word + " -> " + index.get(word));
        }
    }
}