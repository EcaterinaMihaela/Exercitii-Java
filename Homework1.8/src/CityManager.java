import java.util.ArrayList;
import java.util.List;

class CityManager {
    private List<City> cities;

    public CityManager() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public City findCityByName(String name) {
        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(name)) {
                return city;
            }
        }
        return null;
    }

    public void displayAllTouristsInCity(String cityName) {
        City city = findCityByName(cityName);
        if (city != null) {
            System.out.println("Turiști în hotelurile din " + cityName + ":");
            for (Hotel hotel : city.getHotels()) {
                hotel.displayTourists();
            }
        } else {
            System.out.println("Orașul " + cityName + " nu a fost găsit.");
        }
    }

    public boolean isPersonAccommodatedInCity(String personName, String cityName) {
        City city = findCityByName(cityName);
        if (city != null) {
            for (Hotel hotel : city.getHotels()) {
                for (Tourist tourist : hotel.getTourists()) {
                    if (tourist.getName().equalsIgnoreCase(personName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void displayAllPersonsAndTourists() {
        System.out.println("Toate persoanele și turiștii înregistrați:");
        for (City city : cities) {
            for (Hotel hotel : city.getHotels()) {
                for (Tourist tourist : hotel.getTourists()) {
                    System.out.println("- " + tourist.getName() + " (Tourist)");
                }
            }
        }
    }
}
