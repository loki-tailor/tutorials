var url = "http://mylogger.io/log";

function log(message) {
  // send an HTTP request
  console.log(message);
}

// module.exports.log = log; // usage woudl be => const logger = require('logger'); logger.log("abc");

// since exports is reference to module.exports
// we can ommit module keyword, since 'exports' is available as 'module wrapper function'
// i.e. below is also valid:
exports.log = log;

module.exports = log; // usage would be => const logger = require('logger'); logger('message');

module.exports.endPoint = url;
