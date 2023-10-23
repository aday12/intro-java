package gov.test;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
     int[] ages = new int[2];
     ages[0] = 26;
     ages[1] = 30;

     for(int age : ages){
         System.out.printf("The age is: %s\n", age);
     }
        System.out.printf("This array has %s values\n", ages.length);

        System.out.println(Arrays.toString(ages));
        System.out.println();

        double[] temps = {68.3, 88.0, 73, 66.2, 70.0};

        for(double temp : temps){
            System.out.printf("The current temperature is: %s\n", temp);
        }
        System.out.println(Arrays.toString(temps));
        System.out.println();

        String[] names = { "aaron", "megan" };
        System.out.println(Arrays.toString(names));
    }
}
