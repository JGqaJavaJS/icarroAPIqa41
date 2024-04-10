package tests;

import api.CarsAPI;
import api.UserAPI;
import dto.UserDTO;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    UserAPI userAPI = new UserAPI();
    CarsAPI carsAPI = new CarsAPI();

    UserDTO user = new UserDTO()
            .withUsername("qa42@mail.com")
            .withPassword("1234Aa123 4#");

    String token = "";

    @BeforeSuite
    public void getToken() {
        Response response = userAPI.getResponseLoginUser(user);
        System.out.println(response.getStatusCode());
        token = userAPI.getTokenFromResponse(response);
        System.out.println(token);
    }

}
