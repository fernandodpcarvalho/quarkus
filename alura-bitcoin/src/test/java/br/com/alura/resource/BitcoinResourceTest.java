package br.com.alura.resource;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
class BitcoinResourceTest {

    @Test
    public void statusCodeDeveSer200() {
        RestAssured.given().get("bitcoins").then().statusCode(200);
    }
}