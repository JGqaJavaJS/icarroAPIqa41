package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CarsAPI extends BaseAPI{

    String uriGetCities = "/v1/cars/cities";
    String uriMyCars = "/v1/cars/my";

    public Response getAllCities() {
        return given().when().get(baseURL + uriGetCities)
                .thenReturn();
    }

    public Response getAllMyCars(String token) {
        return given().contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .get(baseURL + uriMyCars)
                .thenReturn();
    }
}
