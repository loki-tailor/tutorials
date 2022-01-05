// at runtime below is what happens
// below is called Module Wrapper Function
// (function (exports, require, module, __filename, __dirname) { // actual code goes here });

const logger = require("./logger"); // .js is optional

function sayHello(name) {
  console.log("hello " + name);
}

// sayHello('lokeshwar');

// console.log(window); // error

console.log("############################");

console.log(module);
console.log(logger);
logger("[logger] lokeshwar");

console.log("############################");

console.log(__filename);
console.log(__dirname);

console.log("############################");
