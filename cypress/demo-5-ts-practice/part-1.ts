// tsc compiler only warns the dev that there are errors
// tsc compiler will go ahead and transpile the ts to js even if [type or syntactical] errors  are there
// since the thing that that it will compile is in a way valid js

// the number of arguments passed to a function do not have to match the function signature. we can pass more or less args

// optional arguments can be written in function signature as: var?, and it has to be in the end of arg list

// any: keyword allows us to store any data type in the variable in the code.
// union: can store multiple data types, but not all.

// readonly, private, protected, public modifiers

var fn = () => 'response'

var a: number;
var b: boolean;
var c: string;
var d: undefined; // not much use
var e: any;
var f: number | string;
a = 23;
b = true;
c = 'loki';
// a = 'loki';  // error
d = undefined;
// d = a; //  error
f = 'loki'
f = 20
// f = true // error

var myArr: number[];
myArr = [1, 2, 3];
// myArr = ['loki']
// myArr.push( 'loki' );
myArr.push( 1 );

// tuple
var arr2: [number, boolean];
arr2 = [10, true]
// arr2 = [true, a]; // error


function add ( a: number, b: number, c = 0, d = 0, e?: number ): number {
    return a + b + c + d
}

console.log( add( 1, 2 ) );
console.log( add( 1, 2, 3 ) );
console.log( add( 1, 2, 3, 5 ) );
// console.log( add( 'loki', 2 ) ); error
