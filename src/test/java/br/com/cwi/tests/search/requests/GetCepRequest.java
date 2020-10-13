package br.com.cwi.tests.search.requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetCepRequest {

    public Response cep(int cep){
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get(cep+"/json/")
                .prettyPeek();
    }
}
