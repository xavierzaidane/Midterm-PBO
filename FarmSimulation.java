import java.util.Scanner;

public class FarmSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameTime gameTime = new GameTime();
        Weather weather = new Weather();
        Player player = new Player();
        Store store = new Store();
        Land land = new Land();

        while (true) {
            System.out.println("\n--- Day " + gameTime.getDay() + " ---");
            weather.updateWeather();
            System.out.println("1. Go to Store");
            System.out.println("2. Plant Crop");
            System.out.println("3. Water Crops");
            System.out.println("4. Grow Crops");
            System.out.println("5. Harvest Crops");
            System.out.println("6. Rest");
            System.out.println("7. Show Inventory");
            System.out.println("8. Next Day");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    store.displayItems();
                    System.out.println("Which crop would you like to buy?");
                    int cropChoice = scanner.nextInt();
                    Crop crop = store.getCrop(cropChoice - 1);
                    if (crop != null) {
                        player.buyCrop(crop, store);
                    }
                    break;
                case 2:
                    System.out.println("Which crop do you want to plant?");
                    player.showInventory();
                    System.out.println("Enter crop number to plant:");
                    int plantChoice = scanner.nextInt();
                    if (plantChoice > 0 && plantChoice <= player.getInventory().size()) {
                        player.plantCrop(land, player.getInventory().get(plantChoice - 1));
                    }
                    break;
                case 3:
                    land.waterAllCrops();
                    break;
                case 4:
                    land.growCrops();
                    break;
                case 5:
                    land.harvestCrops();
                    break;
                case 6:
                    player.rest();
                    break;
                case 7:
                    player.showInventory();
                    break;
                case 8:
                    gameTime.nextDay();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
