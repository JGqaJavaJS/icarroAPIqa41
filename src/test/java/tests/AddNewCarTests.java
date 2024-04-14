package tests;

import api.CarsAPI;
import dto.CitiesDTO;
import dto.CityInfoDTO;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

public class AddNewCarTests extends BaseTest{

    @Test
    public void test() {
       // System.out.println(Optional.ofNullable((carsAPI.getAllCities().path("cities"))));

        CitiesDTO citiesDTO = carsAPI.getAllCities().as(CitiesDTO.class);
        List<CityInfoDTO> infoCities = citiesDTO.getCities();
        for(CityInfoDTO info: infoCities) {
            System.out.println(info.getCity());
        }
    }
}
