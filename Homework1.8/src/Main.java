public class Main {
    public static void main(String[] args) {
        City bucharest = new City("București");
        City cluj = new City("Cluj-Napoca");

        CityManager manager = new CityManager();
        manager.addCity(bucharest);
        manager.addCity(cluj);

        Address hotelAddress1 = new Address("Bd. Unirii 10", bucharest, "010203");
        Address hotelAddress2 = new Address("Str. Memorandumului 5", cluj, "400500");

        Hotel hilton = new Hotel("Hilton", hotelAddress1);
        Hotel ritz = new Hotel("Ritz", hotelAddress2);

        Address touristAddress = new Address("Calea Victoriei 12", bucharest, "010404");
        Tourist tourist1 = new Tourist("Ion Popescu", touristAddress, hilton);
        Tourist tourist2 = new Tourist("Maria Ionescu", touristAddress, hilton);

        bucharest.displayHotels();
        cluj.displayHotels();

        manager.displayAllTouristsInCity("București");

        tourist1.moveToHotel(ritz);

        manager.displayAllTouristsInCity("Cluj-Napoca");

        boolean isAccommodated = manager.isPersonAccommodatedInCity("Ion Popescu", "Cluj-Napoca");
        System.out.println("Ion Popescu este cazat în Cluj-Napoca? " + (isAccommodated ? "Da" : "Nu"));

        manager.displayAllPersonsAndTourists();
    }
}