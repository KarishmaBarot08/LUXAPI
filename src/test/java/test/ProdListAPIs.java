package test;

import api.endpoints.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProdListAPIs {

    @Test
    public void testListCategories(){
        Response response = ListAPIs.listCategories();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListServices(){
        Response response = ListAPIs.listServices("montgomery");
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListServicesTypes(){
        Response response = ListAPIs.listServicesTypes();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test()
    public void testListCentres(){
        Response response = ListAPIs.listCentres();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test()
    public void testListDeals(){
        Response response = ListAPIs.listDeals();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListEvents(){
        Response response = ListAPIs.listEvents();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListNotices(){
        Response response = ListAPIs.listNotices();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListParticipants(){
        Response response = ListAPIs.listParticipants();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListRetailers(){
        Response response = ListAPIs.listRetailers();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListSchedules(){
        Response response = ListAPIs.listSchedules();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
    @Test
    public void testListStores(){
        Response response = ListAPIs.listStore();
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.jsonPath().getMap("meta").containsKey("page_count"), "Page count not found in the response");
    }
}
