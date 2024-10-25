class Vegetables extends Crop {
    public Vegetables() {
        super("Vegetables", 3, 1); // Vegetables take 3 days to grow, needs 1 unit of water
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Vegetables! You got 5 units of Vegetables.");
    }

    @Override
    protected String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}