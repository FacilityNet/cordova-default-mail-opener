package com.fomenkoartjoms.cordova.plugin;
// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class DefaultMailPlugin extends CordovaPlugin {
  @Override
  public boolean execute(String action, JSONArray args,
    final CallbackContext callbackContext) {
      Intent emailIntent = new Intent(Intent.ACTION_MAIN);
      emailIntent.addCategory(Intent.CATEGORY_APP_EMAIL);
      // Send a positive result to the callbackContext
      PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
      callbackContext.sendPluginResult(pluginResult);
      return true;
  }
}