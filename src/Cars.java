public class Cars {
    String name;
    String model;
    String fuel;
    int maxSpeed;
    int year;
    double volume;

    public Cars() {
    }

    public Cars(String name, String model, int maxSpeed, int year, double volume, String fuel) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
}
