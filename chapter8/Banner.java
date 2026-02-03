package chapter8;

import java.util.ArrayList;

public class Banner {
    public static void main(String[] args) {
        ArrayList<Person> personsList = new ArrayList<>();
        Person persons[] = new Person[15_000];
        persons[0] = new Student("John Smith","900000000", "123 street, city, state, usa", "jsmith@samford.edu");
        persons[1] = new Faculty("Jane Doe","800000000", "456 avenue, city, state, usa","janedoe@samford.edu");
        persons[2] = new Staff("Jim Brown","700000000", "789 boulevard, city, state, usa","jim@samford.edu");

        for(Person person: persons){
            if(person != null){
                System.out.println("Name: " + person.getName());
                System.out.println("Type: " + person.getType());
            }
        }
    }
}
