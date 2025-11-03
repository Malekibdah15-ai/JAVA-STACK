import java.util.ArrayList;

public class Order {
    private String customerName;
    private double total;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addMenuItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
      return this.total;
    }

    public void printOrder() {
        System.out.println("\nOrder for " + customerName + ":");
            for (Item item : items) {
                System.out.printf("%s   $%.2f\n ", item.getName(), item.getPrice());
            }
            System.out.printf("Total: $%.2f\n\n", getTotal());
        }
        
}


