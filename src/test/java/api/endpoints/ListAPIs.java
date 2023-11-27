package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import test.TokenGenerator;

import static io.restassured.RestAssured.given;

public class ListAPIs {
    public static Response listCategories(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_categories_prod);
        return response;
    }
    public static Response listServices(String centreId){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .pathParam("centre_id",centreId)
                .log().all()
                .when()
                .get(Routes.list_services_prod);
        return response;

    }
    public static Response listServicesTypes(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_services_types_prod);
        return response;

    } public static Response listCentres(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_centres_prod);
        return response;
    }
    public static Response listDeals(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_deals_prod);
        return response;
    }
    public static Response listEvents(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_events_prod);
        return response;
    }
    public static Response listNotices(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_notices_prod);
        return response;
    }
    public static Response listParticipants(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_participants_prod);
        return response;
    }
    public static Response listRetailers(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_retailers_prod);
        return response;
    }
    public static Response listSchedules(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_schedules_prod);
        return response;
    }
    public static Response listStore(){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("api_key",Routes.api_key_prod)
                .log().all()
                .when()
                .get(Routes.list_stores_prod);
        return response;
    }
}
