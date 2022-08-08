// tsc .\demo-types.ts; node demo-types.js

let SEP = "############################################";
let NEW_LINE = "\n";
let myBoolean: boolean = true;
let myNumber: Number = 64;
let hex: number = 0xff;
let binary: number = 0b1010;
let octal: number = 0o744;
let myString1: string = "string with double quotes";
let myString2: string = 'this is a string with single quotes';
let myArray1: number[] = [1, 3, 4, 5];
let myArray2: Array<String> = ["lokekshwar", 'tailor', `template string value = ${binary}`] // generics
let myTuple1: [string, number, boolean] = ["param 1", 2, true]
let myBigInt: bigint = 12312313n;
let myAnything: any = 1; myAnything = "earlier this was number now it's a string"
let myNull = null; // indicates an empty VALUE, will have data-type as `object`
let myUndefined1 = undefined;  // no value is assigned not even NULL
let myUndefined2; // data-type is still undefined

// enums
enum Color { Red, Green, Blue }
let color: Color = Color.Green

let tmp = {
    "key1": "value1",
    "key-2": "value-2"
}

// ##################### PRINTING VARS ############################

console.log(SEP)
// e.g. of template strings
console.log(NEW_LINE);
console.log(`this is an example of template string: "\${myNumber}" = ${myNumber}`)
console.log(NEW_LINE);

console.log(SEP)
console.log("enum value = " + tmp.key1)
console.log(NEW_LINE);

console.log(SEP)
console.table({
    myBoolean, s1: SEP,
    myNumber, hex, binary, octal, s2: SEP,
    myString1, myString2, s3: SEP,
    color, s4: SEP, myBigInt, s5: SEP,
    myAnything
})

console.log(SEP)
console.table({myArray1, myArray2, myTuple1})

console.log(SEP)
console.log(`${Color}`)
console.log(Color)

console.log(SEP)
console.log(typeof myUndefined2)
console.log(typeof myUndefined1)
console.log(typeof myNull)