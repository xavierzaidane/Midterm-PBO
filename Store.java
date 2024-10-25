import java.util.ArrayList;
class Store {
    private ArrayList<Crop> cropsForSale;
    private int cropPrice;

    public Store() {
        this.cropPrice = 20;
        cropsForSale = new ArrayList<>();
        cropsForSale.add(new Rice());
        cropsForSale.add(new Corn());
        cropsForSale.add(new Vegetables());
    }

    public void displayItems() {
        System.out.println("Available crops for sale:");
        for (int i = 0; i < cropsForSale.size(); i++) {
            System.out.println((i + 1) + ". " + cropsForSale.get(i).name + " - Price: " + cropPrice);
        }
    }

    public Crop getCrop(int index) {
        if (index >= 0 && index < cropsForSale.size()) {
            return cropsForSale.get(index);
        } else {
            System.out.println("Invalid choice.");
            return null;
        }
    }

    public int getCropPrice() {
        return cropPrice;
    }
}
