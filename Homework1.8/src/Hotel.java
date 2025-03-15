import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private Address address;
    private List<Tourist> tourists;

    public Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
        this.tourists = new ArrayList<>();
        address.getCity().addHotel(this);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address newAddress) {
        this.address = newAddress;
    }

    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
    }

    public void removeTourist(Tourist tourist) {
        tourists.remove(tourist);
    }

    public List<Tourist> getTourists() {
        return tourists;
    }

    public void displayTourists() {
        System.out.println("Turiști cazați la hotelul " + name + ":");
        for (Tourist tourist : tourists) {
            System.out.println("- " + tourist.getName());
        }
    }
}
