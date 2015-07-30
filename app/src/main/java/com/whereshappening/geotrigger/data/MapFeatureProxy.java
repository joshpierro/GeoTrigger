package com.whereshappening.geotrigger.data;

import retrofit.http.GET;
import retrofit.http.Query;


/**
 * Created by pierro on 7/25/15.
 */
public interface MapFeatureProxy {

    public static final String SERVER_URL = "http://joshpierro.cartodb.com/api/v2";
    public static final String FEATURES_PATH = "/sql";

    @GET(FEATURES_PATH)
    public CartoDbResult getMapFeatures(@Query("q") String query);

}
