// short comings of js

// #1 - can assign anything to anything
var a = 123
a = "loki"

// #2 - can skip or overpass args passing to a function
function add (a, b) { return a + b }
console.log(add(1, 2)); // 3
console.log(add(1)); // NaN
console.log(add(5, 7, "loki"));// "loki" is ignored

// #3 - can't enforce structure of an object. objs are loosely structured
var person = { 'fName': 'loki', 'lName': 'tai' }
console.log(person);
person.foo = 10
console.log(person);

// browsers / nodejs only understand javascript