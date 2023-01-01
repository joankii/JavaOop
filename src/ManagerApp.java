public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "joan";
        manager.sayHello("Joan");

        var VicePresident = new VicePresident();
        VicePresident.name = "Joan";
        VicePresident.sayHello("Joan");
    }

}
