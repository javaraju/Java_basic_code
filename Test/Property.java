package Test;

public class Property {

    private int propertyId;
    private String name;
    private String city;

    private double price;

    private String flateType;


    public Property(int propertyId, String name, String city, double price, String flateType) {
        this.propertyId = propertyId;
        this.name = name;
        this.city = city;
        this.price = price;
        this.flateType = flateType;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlateType() {
        return flateType;
    }

    public void setFlateType(String flateType) {
        this.flateType = flateType;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", flateType='" + flateType + '\'' +
                '}';
    }
}
