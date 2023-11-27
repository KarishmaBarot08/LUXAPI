package api.endpoints;

public class Routes {
    //QA environment
    public static String base_url="https://api.lux-eu.qa.westfield.com/v1";
    public static String api_key = "6LHei3PZNc4aaAJ4jJJR69TqMGob9cuN1TKZiKiA";
    public static String apiKeySecure ="demoapikey1234567890";
    public static String username = "karishma.barot@ext.urw.com";
    public static String password = "PaniPuri$8";
    public static String client_id = "1f545fd55f450c03ba2ffaa692140866a3aa38db26f38b47ce80c1bbf5c512aa";
    public static String client_secret = "6511de6c9f458ae5a80cc15d3a176efd390a934d5487d323b11c0ffa98c3de0d";

    //Prod environment
    public static String base_url_prod="https://api.lux-eu.westfield.com/v1";
    public static String api_key_prod = "fFqR5gFRZm2t0HWGQR70cG7zjZXWytc6QQfi7pUa";


    // Centres module
    public static String post_centre=base_url+"/centres";
    public static String get_centre=base_url+"/centres/{centre_id}";
    public static String patch_centre=base_url+"/centres/{centre_id}";
    public static String list_centres=base_url+"/centres";

    // Stores module
    public static String post_store=base_url+"/stores";
    public static String get_store=base_url+"/stores/{store_id}";
    public static String patch_store=base_url+"/stores/{store_id}";
    public static String list_stores=base_url+"/stores";

    // Categories module
    public static String post_category=base_url+"/categories";
    public static String get_category=base_url+"/categories/{category_id}";
    public static String patch_category=base_url+"/categories/{category_id}";
    public static String list_categories=base_url+"/categories";
    public static String delete_category=base_url+"/categories/{category_id}";

    // Retailers module
    public static String post_retailer=base_url+"/retailers";
    public static String get_retailer=base_url+"/retailers/{retailer_code}";
    public static String patch_retailer=base_url+"/retailers/{retailer_code}";
    public static String list_retailers=base_url+"/retailers";

    //Notices module

    public static String post_notice=base_url+"/notices";
    public static String get_notice=base_url+"/notices/{notice_id}";
    public static String patch_notice=base_url+"/notices/{notice_id}";
    public static String list_notices=base_url+"/notices";
    public static String delete_notice=base_url+"/notices/{notice_id}";

    //Centre Directory Services module
    public static String post_service=base_url+"/services";
    public static String get_service=base_url+"/services/{service_id}";
    public static String patch_service=base_url+"/services/{service_id}";
    public static String list_services=base_url+"/centres/{centre_id}/services";
    public static String delete_service=base_url+"/services/{service_id}";

    //Centre Directory Services Types module
    public static String post_service_type=base_url+"/services/types";
    public static String get_service_type=base_url+"/services/types/{service_type_id}";
    public static String patch_service_type=base_url+"/services/types/{service_type_id}";
    public static String list_services_types=base_url+"/services/types";
    public static String delete_service_type=base_url+"/services/types/{service_type_id}";

    //Deals module

    public static String post_deal=base_url+"/deals";
    public static String get_deal=base_url+"/deals/{deal_id}";
    public static String patch_deal=base_url+"/deals/{deal_id}";
    public static String list_deals=base_url+"/deals";
    public static String delete_deal=base_url+"/deals/{deal_id}";

    //Events module

    public static String post_event=base_url+"/events";
    public static String get_event=base_url+"/events/{event_id}";
    public static String patch_event=base_url+"/events/{event_id}";
    public static String list_events=base_url+"/events";
    public static String delete_event=base_url+"/events/{event_id}";

    //Schedules module

    public static String post_schedule=base_url+"/schedules";
    public static String get_schedule=base_url+"/schedules/{schedule_id}";
    public static String patch_schedule=base_url+"/schedules/{schedule_id}";
    public static String list_schedules=base_url+"/schedules";
    public static String delete_schedule=base_url+"/schedules/{schedule_id}";

    //Participants module

    public static String post_participant=base_url+"/participants";
    public static String get_participant=base_url+"/participants/{participant_id}";
    public static String patch_participant=base_url+"/participants/{participant_id}";
    public static String list_participants=base_url+"/participants";
    public static String delete_participant=base_url+"/participants/{participant_id}";

    //List APIs for prod
    public static String list_centres_prod=base_url_prod+"/centres";
    public static String list_stores_prod=base_url_prod+"/stores";
    public static String list_categories_prod=base_url_prod+"/categories";
    public static String list_retailers_prod=base_url_prod+"/retailers";
    public static String list_notices_prod=base_url_prod+"/notices";
    public static String list_services_prod=base_url_prod+"/centres/{centre_id}/services";
    public static String list_services_types_prod=base_url_prod+"/services/types";
    public static String list_deals_prod=base_url_prod+"/deals";
    public static String list_events_prod=base_url_prod+"/events";
    public static String list_schedules_prod=base_url_prod+"/schedules";
    public static String list_participants_prod=base_url_prod+"/participants";
}
