package com.fomenkoartjoms.cordova.defaultmailplugin;
// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Intent;

public class DefaultMailPlugin extends CordovaPlugin {
  @Override
  public boolean execute(String action, JSONArray args,
    final CallbackContext callbackContext) {
      // Send a positive result to the callbackContext
      Intent intent = Intent(Intent.ACTION_MAIN);
      intent.addCategory(Intent.CATEGORY_APP_EMAIL);
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      this.startActivity(intent);
      PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
      callbackContext.sendPluginResult(pluginResult);
      return true;
  }
}