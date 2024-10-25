import java.util.ArrayList;

class Land {
    private ArrayList<Crop> crops;

    public Land() {
        this.crops = new ArrayList<>();
    }

    public void plantCrop(Crop crop) {
        crops.add(crop);
        System.out.println("Planted " + crop.name + " on the land.");
    }

    public void waterAllCrops() {
        for (Crop crop : crops) {
            crop.water();
        }
    }

    public void growCrops() {
        for (Crop crop : crops) {
            crop.grow();
        }
    }

    public void harvestCrops() {
        ArrayList<Crop> toRemove = new ArrayList<>();
        for (Crop crop : crops) {
            System.out.println(crop.name + " has grown for " + crop.daysGrown + " days. Needs " + crop.daysToHarvest + " days to harvest.");
            if (crop.isReadyToHarvest()) {
                crop.harvest();
                toRemove.add(crop); 
            }
        }
        crops.removeAll(toRemove);
        if (toRemove.isEmpty()) {
            System.out.println("No crops are ready to harvest.");
        }
    }
}
    
