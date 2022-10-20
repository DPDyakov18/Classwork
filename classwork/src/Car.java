public class Car {

    private String brand;
    private int year;
    private String model;
    private double fuelQuantity;
    private double fuelConsumption;

    public Car() {
        this.brand = "VW";
        this.year = 2025;
        this.model = "Golf";
        this.fuelQuantity = 200d;
        this.fuelConsumption = 10d;
    }
    public Car(String brand, String model, int year){
        this();
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    public Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption) {
        this(brand, model, year);
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public void drive(double distance){
        if((this.fuelQuantity-(distance*fuelConsumption))>0){
            //whoIAm();
        }
    }
}