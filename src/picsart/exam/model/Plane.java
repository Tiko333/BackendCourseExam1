package picsart.exam.model;

public class Plane {

    private String model;

    private String country;

    private int year;

    private int hours;

    private boolean military;

    private String engineType;

    private int weight;

    private int wingspan;

    private int topSpeed;

    private int seats;

    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingSpan) {
        this.wingspan = wingSpan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("\n\nModel: " + model + " \n" +
                "Country: " + country + "\n" +
                "Year: " + year + "\n" +
                "Hours: " + hours + "\n" +
                "Is military: " + military + "\n" +
                "Engine type: " + engineType + "\n" +
                "Weight: " + weight + "\n" +
                "Wingspan: " + wingspan + "\n" +
                "Top speed: " + topSpeed + "\n" +
                "Seats: " + seats + "\n" +
                "Cost: " + cost + "$");
    }
}
