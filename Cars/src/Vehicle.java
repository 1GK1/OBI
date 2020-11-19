import java.text.SimpleDateFormat;
import java.util.*;

public class Vehicle implements Cloneable, Additionable, Comparable<Vehicle> {

    protected String licensePlate;
    protected int maxSpeed;
    protected List<String> additionalEquipment;
    private Date registrationDate;

    // constructor
    public Vehicle(String licensePlate, int maxSpeed) {
        this.licensePlate = licensePlate;
        this.maxSpeed = maxSpeed;
        this.additionalEquipment = new ArrayList<>(List.of("spare wheel", "air-conditioning", "heated seats"));
        this.registrationDate = new Date();
    }

    public void setRegistrationDate(int year, int month, int day) {
        Date newRegistrationDate = new GregorianCalendar(year, month - 1, day).getTime();
        registrationDate.setTime(newRegistrationDate.getTime());
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(maxSpeed, other.maxSpeed);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return "\nObject from Class: " + getClass().getName() +
                "\nLicense plate: " + licensePlate +
                "\nMaximum speed: " + maxSpeed + " km/h" +
                "\nEquipment: " + getAdditionalEquipment() +
                "\nRegistration date: " + dateFormat.format(registrationDate) + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, maxSpeed, additionalEquipment);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (this.getClass() != otherObject.getClass()) return false;

        Vehicle other = (Vehicle) otherObject;

        return (this.licensePlate.equals(other.licensePlate)
                && maxSpeed == other.maxSpeed)
                && this.additionalEquipment.equals(other.additionalEquipment);
    }

    public Vehicle clone() throws CloneNotSupportedException {
        //deep copying
//        Vehicle cloned = (Vehicle) super.clone();
//        cloned.registrationDate = (Date) registrationDate.clone();
//        return cloned;

        //shallow copying
        return (Vehicle) super.clone();
    }

    public List<String> getAdditionalEquipment() {
        return additionalEquipment;
    }

    public void setAdditionalEquipment(List<String> additionalEquipment) {
        this.additionalEquipment = additionalEquipment;
    }

    static class InnerVehicle {

//        public String toString() {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//            return "\nObject from Class: " + getClass().getName() +
//                    "\nLicense plate: " + licensePlate +
//                    "\nMaximum speed: " + maxSpeed + " km/h" +
//                    "\nEquipment: " + getAdditionalEquipment() +
//                    "\nRegistration date: " + dateFormat.format(registrationDate) + "\n";
//        }
    }
}