package org.example.set;

import java.util.HashSet;

public class HashSetEjemplo3 {
    public void main() {
        HashSet<String> set = new HashSet<>();

        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("tiger");
        set.add("lion");

        System.out.println("HashSet elements: " + set);

        set.remove("mouse");

        System.out.println("After removing 'mouse': " + set);
    }
}

