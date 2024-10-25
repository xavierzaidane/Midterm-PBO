import java.util.Random;

class Weather {
    private String[] weatherConditions = {"Sunny", "Rainy", "Cloudy", "Stormy"};
    private String currentWeather;
    private Random rand = new Random();

    public Weather() {
        updateWeather();
    }

    public void updateWeather() {
        currentWeather = weatherConditions[rand.nextInt(weatherConditions.length)];
        System.out.println("Today's weather: " + currentWeather);
    }

    public String getCurrentWeather() {
        return currentWeather;
    }
}