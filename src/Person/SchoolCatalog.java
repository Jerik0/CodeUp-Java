package Person;

public class SchoolCatalog {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jonathan", "Carrico");
        person1.shoeSize = 13;
        person1.location = "San Antonio, Texas";
        person1.age = 31;

        person1.getName();
        person1.sayHello();

    }

}
