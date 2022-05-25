// normal functions

function sum(a, b) {
  return a + b;
}

function product(a, b) {
  return a * b;
}

console.log(sum(10, 20));
console.log(product(2, 3));

const val = product(121324, 12312312412);
console.log(val);

// anonymous functions: functions that don't have name, rest all is normal
// most commonly used when need to do a callback
// callback is a function that can be used as an input to another function
// e.g. apply a logic after an event has occured
// NOTE: setTimeout(func, ms); is a function which takes 2 arguments
console.log("2 second wait...");
setTimeout(function () {
  // we can give this function a name, but it's pointlesss like - // setTimeout(function() funcName {
  console.log("hey ! lokeshwar !! (came after 2 seconds)");
  // return value is undefuned, unless explicitly specified the 'return' keyword
}, 2000);

// syntax
// setTimeout(function() { console.log("abc"); }, 1000); //
// setTimeout(functionName, timeInMills);

// arrow function: 1
console.log("2 second wait...");
setTimeout(
  () => console.log("arrow function with 2 seconds, in 1 line only..."),
  2000
);
// arrow function imp points:
// * if 1 line of code, assumed that is the return value
// * semi-colon not required / curly braces not required
// * if want to use more than 1 line, then use curly braces and return keyword
// * i.e. in arrow function, the return value is defined
// * however, in normal anon function, the return value is undefined unless specified exlicitly
// tip: do-not use arrow function for fancy readability...just to be cool !

// IMPORTANT: above 2 setTimeout is happening asnyc: maybe => not waiting for timer to complete and continuing with next statement
// i.e. only the statements specified in the setTimeOut function will wait for the specified time

console.log("done..");
