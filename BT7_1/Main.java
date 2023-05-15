package OOP.BT7_1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", "Premium");
        Visit v1 = new Visit(c1, 50, 50);
        System.out.println(v1.getTotalCost()); // Output: 120.0

        Customer c2 = new Customer("Mary", "Gold");
        Visit v2 = new Visit(c2, 60, 60);
        System.out.println(v2.getTotalCost()); // Output: 110.0

        Customer c3 = new Customer("Bob", "Silver");
        Visit v3 = new Visit(c3, 70, 70);
        System.out.println(v3.getTotalCost()); // Output: 81.0

        Customer c4 = new Customer("Tom", "Non-member");
        Visit v4 = new Visit(c4, 80, 80);
        System.out.println(v4.getTotalCost()); // Output: 100.0
    }
}
