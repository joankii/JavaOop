class Person {

    String name;
    String address;
    final String country = "Indonesia";

    Person(String paraName, String paraAddress){
        name = paraName;
        address = paraAddress;
    }

    Person(String paraName) {
        this(paraName, null);
    }
    Person(){
        this(null);
    }


    void sayHello(String paraName){
        System.out.println("Hello " + paraName + ", My Name is " + name);
    }

}
