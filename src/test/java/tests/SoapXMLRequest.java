package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SoapXMLRequest {
    @Test
    public void validateSoapXML(){
        File file = new File("./SoapRequest/Add.xml")
        FileInputStream fileInputStream = new FileInputStream(file);
        String requestBody = IOUtils.toString(fileInputStream, "UTF-8");
         
        baseURI = "https://ecs.syr.edu/";
        given().contentType("text/xml").accept(ContentType.XML).body(file);
    }
}
