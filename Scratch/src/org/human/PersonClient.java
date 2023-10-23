package org.human;

import java.time.LocalDate;

class PersonClient {

    //TODO: Run on bday
    public static void main(String[] args) {
        Person p1 = new Person("Aaron", LocalDate.of(1996, 11, 9));
        System.out.println(p1);

        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
    }
}
