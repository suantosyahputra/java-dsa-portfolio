package dsa.projects.textsearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TextSearchEngine engine = new TextSearchEngine();

        engine.addDocument(new Document("doc1",
                "Java is a programming language"));

        engine.addDocument(new Document("doc2",
                "Python is also a programming language"));

        engine.addDocument(new Document("doc3",
                "Java and Python are popular"));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.print("Search word (or 'exit'): ");
            String query = scanner.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            List<String> results = engine.search(query);

            if (results.isEmpty()) {
                System.out.println("No documents found.");
            } else {
                System.out.println("Found in documents: " + results);
            }
        }

        scanner.close();
    }
}