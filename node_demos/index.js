const _ = require("lodash");

const numbers = [12, 4, 5, 6, 32, 344];

_.each(numbers, function (number, i) {
  console.log(number);
});