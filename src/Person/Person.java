package Person;

import java.util.Scanner;

public class Person {

    public String firstName;
    public String lastName;
    public int shoeSize;
    public String location;
    public int age;

    public String getName() {
        System.out.println(firstName + " " + lastName);
        return "there you go";
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayHello() {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }

}
