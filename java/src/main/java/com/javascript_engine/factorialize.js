/*
 * created @ Thu Mar 10 2022 5:32:35 am
 * ref @ https://golb.hplar.ch/2020/04/java-javascript-engine.html
 */

function factorialize(num) {
  if (num === 0 || num === 1) {
    return 1;
  }

  var result = new java.math.BigDecimal(String(num));
  for (var i = num - 1; i >= 1; i--) {
    result *= i;
  }

  return result.toString();
}
