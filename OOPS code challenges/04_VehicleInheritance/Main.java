class Vehicle {
    protected final String brand;
    protected final int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private final int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Motorcycle extends Vehicle {
    private final boolean hasCarrier;

    public Motorcycle(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has carrier: " + hasCarrier);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota", 2023, 4),
            new Motorcycle("Yamaha", 2022, true)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.start();
            System.out.println();
        }
    }
}
