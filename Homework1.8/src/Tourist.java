class Tourist extends Person {
    private Hotel currentHotel;

    public Tourist(String name, Address address, Hotel hotel) {
        super(name, address);
        this.currentHotel = hotel;
        if (hotel != null) {
            hotel.addTourist(this);
        }
    }

    public Hotel getCurrentHotel() {
        return currentHotel;
    }

    public void moveToHotel(Hotel newHotel) {
        if (currentHotel != null) {
            currentHotel.removeTourist(this);
        }
        this.currentHotel = newHotel;
        newHotel.addTourist(this);
        System.out.println(name + " s-a mutat la hotelul " + newHotel.getName());
    }
}