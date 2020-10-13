package br.com.cwi.tests.search.tests;

import br.com.cwi.tests.base.tests.BaseTest;
import br.com.cwi.tests.search.requests.GetCepRequest;
import br.com.cwi.utils.Utils;
import org.junit.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.lessThan;

public class GetCepTests extends BaseTest {

    GetCepRequest getCepRequest = new GetCepRequest();

    @Test
    public void getValidCep() throws Exception{
        getCepRequest.cep(91060900).then()
                .statusCode(200)
                .time((lessThan(4L)), TimeUnit.SECONDS)
                .body(matchesJsonSchema(new File(Utils.getContractsBasePath("search", "cep"))));
    }

    @Test
    public void getNonexistentCep() throws Exception{
        getCepRequest.cep(10060900).then()
                .statusCode(200)
                .time((lessThan(4L)), TimeUnit.SECONDS)
                .body(matchesJsonSchema(new File(Utils.getContractsBasePath("search", "erro"))));
    }

    @Test
    public void getInvalidCep() throws Exception{
        getCepRequest.cep(910609005).then()
                .statusCode(400)
                .time((lessThan(4L)), TimeUnit.SECONDS);
    }

}
