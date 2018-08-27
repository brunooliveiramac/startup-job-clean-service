package endtoend.support;

import static io.restassured.RestAssured.given;

public class JourneySupport {

    private static final String JOBS = "http://localhost:8085/jobs";
    private static JourneySupport journeySupport;

    public static JourneySupport instance() {
        if (journeySupport == null) {
            journeySupport = new JourneySupport();
            return journeySupport;
        }
        return journeySupport;
    }

    public void search() {
        given()
                .when()
                .get(JOBS)
                .then().statusCode(200).extract().response().peek().asString();
    }

    public void seeDetail() {
        given().when().get(JOBS + "/1").then().statusCode(200).extract().response().peek();
    }

    public void enroll() {
        given().when().post(JOBS + "/1").then().statusCode(200).extract().response().peek();
    }
}
