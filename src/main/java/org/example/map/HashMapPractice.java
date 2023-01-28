package org.example.map;
import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {
    public void run (){
        MapAdapter map = new MapAdapter();
        map.putValue("name", "John Doe");
        map.putValue("age", 30);
        System.out.println("Size: " + map.size());
        System.out.println("Name: " + map.getValue("name"));
        System.out.println(map.toString());
    }
}
class MapAdapter {
    private Map<String, Object> map;

    public MapAdapter() {
        map = new HashMap<String, Object>();
    }

    public void putValue(String key, Object value) {
        map.put(key, value);
    }

    public Object getValue(String key) {
        return map.get(key);
    }

    public int size() {
        return map.size();
    }

    @Override
    public String toString() {
        return "MapAdapter{" +
                "map=" + map +
                '}';
    }
}
