const chai = require("chai");
const expect = chai.expect;
const should = chai.should();
const assert = chai.assert; // no chaining possible

// expect API examples
let a = 1;
let b = 1;
expect(a).to.be.equals(b, "a and b are not equal");
a.should.be.equals(b);
assert.equal(a, b, 'a and b are not equal');

// specific input is object/string/boolean
function myObj() {
  return { a: 100, b: "Hello" };
}
x = new myObj();
y = new myObj();
expect(x).to.be.an("object");
// expect(x).to.be.equal(y, 'x and y are not equal');
// above will won't compare contents of object, but rather the objects only

// deep.equal or deep.equals
expect(x).to.be.deep.equals(y, "x and y are not equal");
x.should.be.deep.equals(y, "x and y are not equal");
assert.deepEqual(x, y, "x and y are not equal");

// chaining expression
// x is an object; x and y are equal
expect(x).to.be.an("object").and.to.be.deep.equals(y);
x.should.be.an("object").an.to.be.deep.equals(y);

// arrays
let numbers = [1, 2, 3, 0];
expect(numbers).to.be.an.an("array").that.includes(3); // no error
// expect(numbers).to.be.an.an('array').that.includes('3'); // error
expect(numbers).to.be.an.an("array").that.includes(0); // no error: won't  execute since above is failinng
// expect(numbers).to.be.an.an('array').that.includes('3'); // error: won't execute since above is failing
numbers.should.be.an.an("array").that.includes(3); // no error
assert.isArray(numbers, "numbers is not an array");


// should etras
// should -> Object.Prototype - a.should
// existince of an object
function writeToAFile(error) {
  // should extras

  // normal scenario, when error is not null or undefined
  error.should.not.exists();
  // above will fail, if error is null or undefined

  // given that error is null or undefined below will work
  should.not.exist(error);
}

// writeToAFile(1); // AssertionError: expected 1 to not exist
// writeToAFile(null); // won't work, error = TypeError: Cannot read properties of null (reading 'should')

/*
    should extras
    - should.exist
    - should.not.exist
    - should.equal
    - should.not.equal
    - should.Throw
    - should.not.Throw
*/