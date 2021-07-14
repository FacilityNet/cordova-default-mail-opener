function DefaultMailPlugin() {}

DefaultMailPlugin.prototype.open = function() {
  var options = {};
  cordova.exec(successCallback, errorCallback, 'DefaultMailPlugin', 'open', [options]);
}

DefaultMailPlugin.install = function() {
  if (!window.plugins) {
    window.plugins = {};
  }
  window.plugins.defaultMailPlugin = new DefaultMailPlugin();
  return window.plugins.defaultMailPlugin;
};
cordova.addConstructor(DefaultMailPlugin.install);