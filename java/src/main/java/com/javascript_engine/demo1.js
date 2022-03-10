// to execute this thru JVM use below command:
// jjs demo1.js
// ref: https://www.geeksforgeeks.org/nashorn-javascript-engine-in-java-with-examples/

/*
 * created @ Thu Mar 10 2022 3:56:56 am
 * ref @
 */

var abc = function () {
  print("hello world from demo1.js ...");
};

var abc = function (name) {
  print("hello " + name + " from demo1.js ...");
};

// unless we call the function, the "$jjs demo1.js" won't give any output
abc();
abc("abc")
