/*
 * created @ Thu Mar 10 2022 4:54:59 am
 * ref @ https://golb.hplar.ch/2020/04/java-javascript-engine.html
 */


function fibonacci(num) {
    var a = 1, b = 0, temp;
  
    while (num >= 0){
      temp = a;
      a = a + b;
      b = temp;
      num--;
    }
  
    return b;
  }