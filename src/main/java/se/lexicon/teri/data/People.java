package se.lexicon.teri.data;

import se.lexicon.teri.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] personArray = new Person[0];

    public int size() {
        return personArray.length;
    }

    public Person[] findAll(){
        return personArray;
    }

    public Person findById(int personId){

        for (Person person : personArray) {
            if (person.getPersonId() == personId) {
                return person;
            }
        }

        return null;
    }

    public Person addPerson(String firstName, String lastName){
        personArray = Arrays.copyOf(personArray, personArray.length + 1);
        Person newPerson = new Person(firstName, lastName);

        personArray[personArray.length - 1] = newPerson;
        return newPerson;
    }

    public void clear(){
        personArray = new Person[0];
    }
}
