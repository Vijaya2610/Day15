package functional;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String personName;
    private String emailld;

    public Person(String personName, String emailld) {
        this.personName = personName;
        this.emailld = emailld;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getEmailld() {
        return emailld;
    }

    public void setEmailld(String emailld) {
        this.emailld = emailld;
    }

    public static void main(String[] args) {
        
    	List<Person> personList = new ArrayList<>();

        personList.add(new Person("John Doe", "john@example.com"));
        personList.add(new Person("Jane Smith", "jane@example.com"));
        personList.add(new Person("Alice Johnson", "alice@example.com"));

        personList.forEach(person -> System.out.println(person.getPersonName() + ": " + person.getEmailld()));
    }
}