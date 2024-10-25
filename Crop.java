abstract class Crop {
    protected String name;
    protected int daysToHarvest;
    protected int waterNeeds;
    protected int daysGrown;

    public Crop(String name, int daysToHarvest, int waterNeeds) {
        this.name = name;
        this.daysToHarvest = daysToHarvest;
        this.waterNeeds = waterNeeds;
        this.daysGrown = 0;
    }

    public void water() {
        System.out.println("Watering the " + name);
        daysGrown++;
    }

    public void grow() {
        if (daysGrown >= daysToHarvest) {
            System.out.println(name + " is ready to harvest!");
        } else {
            System.out.println(name + " is growing. Days left to harvest: " + (daysToHarvest - daysGrown));
        }
    }

    public boolean isReadyToHarvest() {
        return daysGrown >= daysToHarvest;
    }

    public abstract void harvest();

    protected abstract String getName();
}
