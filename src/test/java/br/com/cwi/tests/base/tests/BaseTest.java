package br.com.cwi.tests.base.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass

    public static void setup(){
        RestAssured.baseURI = "https://viacep.com.br/ws/";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
