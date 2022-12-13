public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, String country, String color, double engineVolume, int year) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        this.color = color;
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя - " + engineVolume +
                ", цвет кузова - " + color +
                ", год выпуска - " + year +
                ", страна производства - " + country;
    }
}
