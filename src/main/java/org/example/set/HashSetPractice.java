package org.example.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public void run (){
        SetProxy set = new SetProxy();
        set.add("hello");
        set.add("world");
        set.add("world");
        System.out.println("Size: " + set.size());
        set.remove("hello");
        System.out.println("Size: " + set.size());
        System.out.println(set.toString());
    }
}
class SetProxy {
    private Set<Object> set;

    public SetProxy() {
        set = new HashSet<Object>();
    }

    public boolean add(Object element) {
        if (validate(element)) {
            return set.add(element);
        }
        return false;
    }

    public boolean remove(Object element) {
        if (validate(element)) {
            return set.remove(element);
        }
        return false;
    }

    public int size() {
        return set.size();
    }

    private boolean validate(Object element) {
        // Perform validation on the element here
        return true;
    }

    @Override
    public String toString() {
        return "SetProxy{" +
                "set=" + set +
                '}';
    }
}
