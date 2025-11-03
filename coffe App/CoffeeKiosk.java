import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk{
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk (){
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        item.setIndex(menu.size());
        menu.add(item);
        
    }

    public void displayMenu(){
        for(Item item : menu){
            System.out.printf("%d   %s  $%.2f\n ", item.getIndex(), item.getName(), item.getPrice());
        }
    }
  public void newOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter customer name for new order:");
        String name = scanner.nextLine();

        Order newOrder = new Order(name);
        displayMenu();

        System.out.println("Please enter a menu item index or 'q' to quit:");
        String input = scanner.nextLine();

        while (!input.equals("q")) {
            try {
                int index = Integer.parseInt(input);
                if (index >= 0 && index < menu.size()) {
                    Item item = menu.get(index);
                    newOrder.addMenuItem(item);
                    System.out.printf("%s added to your order.\n", item.getName());
                } else {
                    System.out.println("Invalid index. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'q' to quit.");
            }

            System.out.println("Enter another item index or 'q' to finish:");
            input = scanner.nextLine();
        }

        newOrder.printOrder();
        orders.add(newOrder);
    }
}
    


