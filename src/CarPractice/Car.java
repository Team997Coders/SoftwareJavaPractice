package CarPractice;

public class Car {

    private static String m_brand;
    private static String m_color;
    private static int m_doors;

    public Car(String brand, String color, int doors) {
        this.m_brand = brand;
        this.m_color = color;
        this.m_doors = doors;
    }

    public String getCarAttributes() {
        return "This car is a " + m_brand + ". It is " + m_color + ", and it has " + Double.toString(m_doors) + " doors.";
    }

}
