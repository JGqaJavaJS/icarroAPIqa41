package dto;

import java.util.ArrayList;
import java.util.List;

public class CityInfoDTO {

          String city;
          Double lat;
          Double lng;

    public CityInfoDTO() {
    }

    public CityInfoDTO(String city, Double lat, Double lng) {
        this.city = city;
        this.lat = lat;
        this.lng = lng;
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

    public List<String> getAllCities(CitiesDTO citiesDTO) {
        List<CityInfoDTO> infoCities = citiesDTO.getCities();
        List<String> citiesAll = new ArrayList<>();
        for(CityInfoDTO info: infoCities) {
            citiesAll.add(info.getCity());
        }
        return citiesAll;
    }
}
