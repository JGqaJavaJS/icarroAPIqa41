package dto;

import java.util.List;

public class CitiesDTO {

    List<CityInfoDTO> cities;
    /*
    {
  "cities": [
    {
      "city": "string",
      "lat": 0,
      "lng": 0
    }
  ]
}
     */

    public CitiesDTO(List<CityInfoDTO> cities) {
        this.cities = cities;
    }

    public CitiesDTO() {
    }

    public List<CityInfoDTO> getCities() {
        return cities;
    }

    public void setCities(List<CityInfoDTO> cities) {
        this.cities = cities;
    }
}
