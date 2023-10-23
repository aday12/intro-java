package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * immutable class, more accurately, a class def written in such a way
 * that its instances cannot be changed after creation
 * There are no public methods to do so.
 */
class Person {
    private String name;
    private LocalDate birthDate;

    //ctor
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * returns person's age in whole years
     * ageGetter()
     * wholeYears()
     * ageYears()
     * ageQuery()
     * getAge()
     */

    //accessor methods
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("name= %s, birthDate= %s", getName(), getBirthDate());
    }
}
