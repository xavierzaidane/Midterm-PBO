class GameTime {
    private int day;

    public GameTime() {
        this.day = 1; // Start from day 1
    }

    public int getDay() {
        return day; // Return the current day
    }

    public void nextDay() {
        day++; // Increment the day counter
    }
}
