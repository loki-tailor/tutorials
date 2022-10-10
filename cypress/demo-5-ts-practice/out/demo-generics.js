import { Person } from './person.js';
function doEcho(arg1) {
    return arg1;
}
// although passed as num, but saved as string
// we want ot avoid below
var s1 = doEcho(1);
// #############################################################################
function echo(arg1) {
    return arg1;
}
// var s2: string = echo( 1 ); // error
var s2 = echo(1); // error
// #############################################################################
class Admin extends Person {
}
class Manager extends Person {
}
let ad = new Admin('i am admin', '#1');
let mg = new Manager('i am manager', '#2');
function pEcho(p) {
    console.log(p);
    return p;
}
var foo = pEcho(ad);
