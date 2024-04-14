package tests;

import dto.CitiesDTO;
import dto.CityInfoDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GetAllCitiesTests extends BaseTest{

    @Test
    public void getAllCitiesTest() {
       // System.out.println(Optional.ofNullable((carsAPI.getAllCities().path("cities"))));

        CitiesDTO citiesDTO = carsAPI.getAllCities().as(CitiesDTO.class);
        List<CityInfoDTO> infoCities = citiesDTO.getCities();

        List<String> citiesAll = new ArrayList<>();
        for(CityInfoDTO info: infoCities) {
            //System.out.println(info.getCity());
            citiesAll.add(info.getCity());
        }
// get length ; Random get random index from zero t length
        // get city by index
        System.out.println(citiesAll.get(5));
        Assert.assertTrue(!citiesAll.isEmpty());
    }
}
