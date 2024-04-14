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


-----------------
JOSNbody.f -> m

{
"f":"m",
"L":"s",
"array": [
        "f":"m",
        "L":"s";    JSONbody.array[0].L -> s
        "f":"m",
        "L":"s"
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
