package Person;

public class Person {

    private String name;
    private String surname;
    private String adress;


    public Person(String name, String surname, String adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return name +" "+ surname +" "+ adress;
    }
}
