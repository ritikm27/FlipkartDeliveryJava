package FlipkartDelivery;

import java.util.*;

public class Inventory {
    private Map<String, Item> inventoryMap = new HashMap<>();

    public void addInventory(String brand, String category, int price, int quantity){
        String key = brand.toLowerCase() + "" + category.toLowerCase();

        if(inventoryMap.containsKey(key)){
            inventoryMap.get(key).updateQuantity(quantity);
            return;
        }

        Item item = new Item(brand, category, price, quantity);

        inventoryMap.put(key,item);
    }

    public void printInventory(){
        if(inventoryMap.isEmpty()){
            System.out.println("Inventory is empty");
            return;
        }

        for(String key : inventoryMap.keySet()){
            System.out.println(inventoryMap.get(key).toString());
        }
    }


    public void printSortedInventory(String sortBy, String order) {
        if (inventoryMap.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }

        List<Item> itemList = new ArrayList<>(inventoryMap.values());

        Comparator<Item> comparator;

        // Define sorting logic
        switch (sortBy.toLowerCase()) {
            case "brand":
                comparator = Comparator.comparing(Item::getBrand);
                break;
            case "category":
                comparator = Comparator.comparing(Item::getCategory);
                break;
            case "price":
                comparator = Comparator.comparingInt(Item::getPrice);
                break;
            case "quantity":
                comparator = Comparator.comparingInt(Item::getQuantity);
                break;
            default:
                System.out.println("Invalid sort parameter. Valid options: brand, category, price, quantity.");
                return;
        }

        // Adjust for ascending or descending order
        if ("desc".equalsIgnoreCase(order)) {
            comparator = comparator.reversed();
        }

        // Sort the items
        itemList.sort(comparator);

        // Print sorted inventory
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
}
