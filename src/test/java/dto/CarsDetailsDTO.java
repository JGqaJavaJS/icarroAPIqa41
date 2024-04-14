package dto;

import java.util.List;

public class CarsDetailsDTO {

    String serialNumber;
    String manufacture;
    String model;
    String year;
    String fuel;
    int seats;
    String carClass;
    int pricePerDay;
    String about;
    String city;
    Double lat;
    Double lng;
    String image;
    String owner;
    List<BookedPeriodsDTO> bookedPeriods;

    public CarsDetailsDTO() {
    }

    public CarsDetailsDTO(String serialNumber, String manufacture,
                          String model, String year, String fuel,
                          int seats, String carClass, int pricePerDay,
                          String about, String city, Double lat,
                          Double lng, String image, String owner,
                          List<BookedPeriodsDTO> bookedPeriods) {
        this.serialNumber = serialNumber;
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.seats = seats;
        this.carClass = carClass;
        this.pricePerDay = pricePerDay;
        this.about = about;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.image = image;
        this.owner = owner;
        this.bookedPeriods = bookedPeriods;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<BookedPeriodsDTO> getBookedPeriods() {
        return bookedPeriods;
    }

    public void setBookedPeriods(List<BookedPeriodsDTO> bookedPeriods) {
        this.bookedPeriods = bookedPeriods;
    }
}
