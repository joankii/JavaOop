public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Joan", "Sumsel");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Joan");

    Person person2 = new Person("Joan");

    Person person3;
    person3 = new Person();
    person3.name = "Joan";
    person3.sayHello("syn");

  }
}
