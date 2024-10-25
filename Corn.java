class Corn extends Crop {
    public Corn() {
        super("Corn", 4, 2); // Corn takes 4 days to grow, needs 2 units of water
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Corn! You got 8 units of Corn.");
    }

    @Override
    protected String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}