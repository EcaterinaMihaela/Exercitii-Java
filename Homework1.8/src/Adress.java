class Address {
    private String street;
    private City city;
    private String zipCode;

    public Address(String street, City city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city.getName() + ", " + zipCode;
    }
}
