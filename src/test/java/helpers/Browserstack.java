package helpers;

import static java.lang.String.format;
import static io.restassured.RestAssured.given;


public class Browserstack {
    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .auth().basic("qagurumobile_piB8or", "dqCgQsyscHYt4iEy2vUi")
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
