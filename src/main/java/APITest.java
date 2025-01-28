import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CoinDeskAPITest {
    public static void main(String[] args) {
        // Base URI API
        RestAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";

        // Send the GET request and get the response
        Response response = given().get();

        // Verify the response
        response.then().assertThat()
                .body("bpi.size()", is(3))
                .body("bpi.USD", notNullValue())
                .body("bpi.GBP", notNullValue())
                .body("bpi.EUR", notNullValue());

        // Verify the GBP 'description'
        response.then().assertThat()
                .body("bpi.GBP.description", equalTo("British Pound Sterling"));

        // Print the response body for reference
        response.prettyPrint();


    }
}
