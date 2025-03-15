// Clasa City

import java.util.ArrayList;
import java.util.List;

class City {
    private String name;
    private List<Hotel> hotels;

    public City(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void displayHotels() {
        System.out.println("Hoteluri în " + name + ":");
        for (Hotel hotel : hotels) {
            System.out.println("- " + hotel.getName());
        }
    }
}