import java.util.Objects;

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int maxSpeed, int numberOfSeats) {
        super(licensePlate, maxSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;

        Car otherCar = (Car) other;

        return this.maxSpeed == otherCar.maxSpeed
                && this.numberOfSeats == otherCar.numberOfSeats
                && this.licensePlate.equals(otherCar.licensePlate)
                && this.additionalEquipment.equals(otherCar.additionalEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Number of seats: " + numberOfSeats + "\n";
    }


//    @Override
//    public String toString() {
//        return "\nObject from Class: " + getClass().getName() +
//                "\nNumber of seats: " + numberOfSeats +
//                "\nLicense plate: " + licensePlate +
//                "\nMaximum speed: " + maxSpeed + " km/h"
//                + "\nEquipment: " + getAdditionalEquipment() + "\n";
//    }
}