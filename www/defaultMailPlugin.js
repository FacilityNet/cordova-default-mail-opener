function DefaultMailPlugin() {}

DefaultMailPlugin.prototype.open = function() {
  var options = {};
  cordova.exec(successCallback, errorCallback, 'DefaultMailPlugin', 'open', [options]);
}

module.exports = new DefaultMailPlugin();