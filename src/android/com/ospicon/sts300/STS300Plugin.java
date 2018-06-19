package com.ospicon.sts300;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import android.content.Context;


public class STS300Plugin extends CordovaPlugin {

    private CallbackContext callbackContext;
    private JSONObject data = new JSONObject();

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("start".equals(action)) {

        } else if ("stop".equals(action)) {

        } else if ("beep".equals(action)) {
            PluginResult result = new PluginResult(PluginResult.Status.OK, "123");
            callbackContext.sendPluginResult(result);
            return true;
        }
        return false;  
    }

}