import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<String> inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item) {
        inventory.add(item);

        System.out.println();
        System.out.println("[ITEM ADDED]");
        System.out.println(item + " has been added to your inventory.");
    }

    public void showInventory() {
        System.out.println();
        System.out.println("========== INVENTORY ==========");

        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                System.out.println((i + 1) + ". " + inventory.get(i));
            }
        }

        System.out.println("===============================");
    }

    public boolean hasItem(String item) {
        return inventory.contains(item);
    }
}