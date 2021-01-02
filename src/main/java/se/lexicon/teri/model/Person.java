package se.lexicon.teri.model;

public class Person {
    final int personId;
    String firstName;
    String lastName;

    Person(int personId, String firstname, String lastName){
        this.personId = personId;
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
