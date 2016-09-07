package Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Zenon", "Nibylandia 10");
        Person person2 = new Person("Tomasz", "Nowak", "Grunwaldzka 22");
        Person person3 = new Person("Katarzyna", "Rybak", "Długa 2");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Collections.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2 ){
                return p1.getSurname().compareTo(p2.getSurname());
            }
        });

        for(Person person : people){
            System.out.println(person);
        }
    }
}
