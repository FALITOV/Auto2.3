package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnData() {
        var text = "Hello";
        given()
                .contentType("text/plain; charset=UTF-8")
                .baseUri("https://postman-echo.com")
                .body("Hell")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text))
        ;
    }
}
