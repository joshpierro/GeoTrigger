package com.whereshappening.geotrigger.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by pierro on 7/25/15.
 */
public class Utils {

    public static void MakeToast(Context context, String message){

        Toast toast = Toast.makeText(context,message,Toast.LENGTH_LONG);
        toast.show();

    }

}
