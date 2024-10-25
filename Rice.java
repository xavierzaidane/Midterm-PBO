class Rice extends Crop {
    public Rice() {
        super("Rice", 5, 3); // Rice takes 5 days to grow, needs 3 units of water
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Rice! You got 10 units of Rice.");
    }

    @Override
    protected String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}