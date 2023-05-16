package hashItOut;

import overloadingPractice.books.Book;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        //First program assignment
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");


        System.out.println("---");
        System.out.println("---");


        //Second program assignment using the Book Class from previous assignment
        HashMap<String, Book> hashmap2 = new HashMap<>();

        hashmap2.put("sense", new Book("Sense and Sensibility", 0, 1811));
        hashmap2.put("prejudice", new Book("Pride and prejudice", 0, 1813));

        printValues(hashmap2);
        System.out.println("---");
        printValueIfNameContains(hashmap2, "prejud");
    }


    //Methods for first program assignment
    private static void printKeys(HashMap<String, String> hashmap) {
        System.out.println(hashmap.keySet());
    }

    private static void printKeysWhere(HashMap<String, String> hashmap, String i) {
        for(String key: hashmap.keySet()){
            if(key.contains(i)) System.out.println(key);
        };
    }

    private static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String s) {
        for(String key: hashmap.keySet()){
            if(key.contains(s)) System.out.println(hashmap.get(key));
        };
    }


    //Methods for second program assignment
    private static void printValues(HashMap<String, Book> hashmap2) {
        for(String key: hashmap2.keySet()) {
            System.out.println(hashmap2.get(key));
        }
    }

    private static void printValueIfNameContains(HashMap<String, Book> hashmap2, String i) {
        for(String key: hashmap2.keySet()){
            if(key.contains(i)) System.out.println(hashmap2.get(key));
        };
    }
}
