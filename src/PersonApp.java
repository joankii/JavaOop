public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Joankii" , "Layo");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Joankii");

        Person person2 = new Person("Joankii");
        Person person3;
        person3 = new Person();
        person3.name = "Joankii";


    }
}
