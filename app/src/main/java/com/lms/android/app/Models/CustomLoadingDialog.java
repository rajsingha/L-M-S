package com.lms.android.app.Models;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import com.lms.android.app.R;

import java.util.Objects;

public class CustomLoadingDialog {
    private Activity activity;
    private AlertDialog alertDialog;

    public CustomLoadingDialog(Activity myActivity){
        activity=myActivity;
    }

   public void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_gear_loading_dialog_box,null));
        builder.setCancelable(false);
        alertDialog = builder.create();
        alertDialog.show();
        Objects.requireNonNull(alertDialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        alertDialog.getCurrentFocus();
    }

   public void dismissLoadingDialog(){
        alertDialog.dismiss();
    }


}
