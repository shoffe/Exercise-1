package OOP;
import java.util.ArrayList;
import java.util.List;

public class Item {
   private String name;
    private double sellPrice;
    private int count;

    public Item(String name, double sellPrice, int count) {
        this.name = name;
        this.sellPrice = sellPrice;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "Имя предмета: " + name + "\n" +
                "Его стоимость: " + sellPrice + "\n" +
                "Его количество: " + count + "\n";
    }
}
class Inventory {
    private List<Item> items;

    public Inventory(List<Item> items) {
        this.items = items;
    }

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void delItem(Item item) {
        items.remove(item);
    }
    public List<Item> getItems() {
        return items;
    }



    public static void main(String[] args) {
        Item item1 = new Item("Книга", 10.99, 5);
        Item item2 = new Item("Ручка", 1.99, 10);
        Item item3 = new Item("Блокнот", 4.49, 3);



        Inventory inventory = new Inventory();
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);


        System.out.println("Инвентарь: ");
        for (Item item : inventory.getItems()) {
            System.out.println(item);
        }
    }
}
