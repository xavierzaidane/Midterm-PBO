import java.util.ArrayList;


class Player {
    private int money;
    private int energy;
    private ArrayList<Crop> inventory;

    public Player() {
        this.money = 100;
        this.energy = 100;
        this.setInventory(new ArrayList<>());
    }

    public ArrayList<Crop> getInventory() {
        return inventory;
        
    }

    public void setInventory(ArrayList<Crop> inventory) {
        this.inventory = inventory;
        
    }

    public void buyCrop(Crop crop, Store store) {
        if (money >= store.getCropPrice()) {
            money -= store.getCropPrice();
            getInventory().add(crop);
            System.out.println("You bought " + crop.name + ". Money left: " + money);
        } else {
            System.out.println("Not enough money to buy " + crop.name);
        }
    }

    public void plantCrop(Land land, Crop crop) {
        land.plantCrop(crop);
        getInventory().remove(crop);
    }

    public void rest() {
        energy += 20;
        System.out.println("You rested. Energy now: " + energy);
    }

    public void showInventory() {
        System.out.println("Inventory: ");
        for (Crop crop : getInventory()) {
            System.out.println(crop.name);
        }
    }
}