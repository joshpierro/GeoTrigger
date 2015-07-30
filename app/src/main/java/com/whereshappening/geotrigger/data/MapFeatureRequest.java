package com.whereshappening.geotrigger.data;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

import retrofit.RestAdapter;
import retrofit.RetrofitError;

/**
 * Created by pierro on 7/29/15.
 */
public class MapFeatureRequest extends AsyncTask<String,Void,List<MapFeature>> {
    @Override
    protected List<MapFeature> doInBackground(String...  params) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(MapFeatureProxy.SERVER_URL)
                .build();

        MapFeatureProxy mapFeatureProxy =
                restAdapter.create(MapFeatureProxy.class);

        List<MapFeature>  mapFeatures = null;
        CartoDbResult result = null;
        try{

            result = mapFeatureProxy.getMapFeatures(params[0]);


        }catch (RetrofitError e){
            Log.i("Retrofit",e.toString());
        }

        if(result!=null){
            mapFeatures = result.rows;
        }

        return mapFeatures;


    }
}
