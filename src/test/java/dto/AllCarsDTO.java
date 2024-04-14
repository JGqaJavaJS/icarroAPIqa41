package dto;

import java.util.List;

public class AllCarsDTO {

    List<CarsDetailsDTO> cars;

    public AllCarsDTO() {
    }

    public AllCarsDTO(List<CarsDetailsDTO> cars) {
        this.cars = cars;
    }

    public List<CarsDetailsDTO> getCars() {
        return cars;
    }

    public void setCars(List<CarsDetailsDTO> cars) {
        this.cars = cars;
    }

}
