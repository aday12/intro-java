package gov.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>(); // K: String, V: Double

        gpaMap.put("scott", 2.2);
        gpaMap.put("udyr", 2.9);
        gpaMap.put("gage", 3.8);
        gpaMap.put("titus", 3.69);
        gpaMap.put("aaron", 0.08);
        gpaMap.put("kieth", 3.86);

        Double scottGpa = gpaMap.get("scott");

        dump(gpaMap);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();
        for(double gpa : gpas){
            if (gpa >= 3.5){
                System.out.println(gpa);
            }
        }
        System.out.println();

        // print names of those with a gpa >= 2.75
        for (var entry : gpaMap.entrySet()) {
            if(entry.getValue() >= 2.75){
                System.out.println(entry.getKey());
            }
        }
        System.out.println();


    }

    private static void dump(Map<String, Double> map) {
        for(Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
