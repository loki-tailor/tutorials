import { Person } from './person';

function doEcho ( arg1: any ): any {
    return arg1;
}


// although passed as num, but saved as string
// we want ot avoid below
var s1: string = doEcho( 1 );
// #############################################################################

function echo<T> ( arg1: T ): T {
    return arg1;
}
// var s2: string = echo( 1 ); // error
var s2: number = echo( 1 ); // error

// #############################################################################

class Admin extends Person { }
class Manager extends Person { }

let ad = new Admin( 'i am admin', '#1' );
let mg = new Manager( 'i am manager', '#2' );

function pEcho<T extends Person> ( p: T ): T {
    console.log( p );

    return p;
}

var foo = pEcho( ad );