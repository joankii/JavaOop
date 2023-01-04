public class PolymorphismApp {
    public static void main(String[] args) {
  
  
      Employee employee = new Employee("Joan");
      employee.sayHello("Syn");
  
      employee = new Manager("Joan");
      employee.sayHello("syn");
  
      employee = new VicePresident("Joan");
      employee.sayHello("syn");
  
      sayHello(new Employee("Joan"));
      sayHello(new Manager("syn"));
      sayHello(new VicePresident("kii"));
    }
  
    static void sayHello(Employee employee) {
      if (employee instanceof VicePresident) {
        VicePresident vicePresident = (VicePresident) employee;
        System.out.println("Hello VP " + vicePresident.name);
      } else if (employee instanceof Manager) {
        Manager manager = (Manager) employee;
        System.out.println("Hello Manager " + manager.name);
      } else {
        System.out.println("Hello " + employee.name);
      }
    }
  }