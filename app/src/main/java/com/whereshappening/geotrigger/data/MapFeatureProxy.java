package com.whereshappening.geotrigger.data;

import java.util.List;
import retrofit.http.GET;


/**
 * Created by pierro on 7/25/15.
 */
public interface MapFeatureProxy {

    public static final String SERVER_URL = "http://joshpierro.cartodb.com/api/v2";
    public static final String FEATURES_PATH = "/?q={query}";

    @GET(FEATURES_PATH)
    public List<MapFeatures> getvideos();

}
