package FlipkartDelivery;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addInventory("amul", "milk", 10, 2);
        inventory.addInventory("amul", "curd", 20, 2);
        inventory.addInventory("amul", "milk", 10, 5);
        inventory.addInventory("sanchi", "milk", 10, 4);
        inventory.addInventory("sanchi", "curd", 200, 1);

        inventory.printInventory();
        System.out.println("--------------------------------");
        inventory.printSortedInventory("category", "asc");
        System.out.println("--------------------------------");
        inventory.printSortedInventory("category", "desc");


    }
}
