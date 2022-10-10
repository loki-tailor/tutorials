"use strict";
class Test1 {
    constructor(t, t1_n3) {
        this.t1_n3 = t1_n3;
        this.t1_n1 = 'initial value';
        this.t1_n2 = t;
    }
}
var t1_o1 = new Test1('1st arg', '2nd arg');
console.log(t1_o1);
