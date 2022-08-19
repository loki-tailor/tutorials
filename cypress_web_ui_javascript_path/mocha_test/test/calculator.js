// @created = 2022-02-02
// Mathematical Operations Tests (add, sub, mul, div)

let assert = require("assert");

describe("Mathematical Oeprations - Test Suite", function () {
  let a = 10;
  let b = 20;

  beforeEach(function (done) {
    //     this.timeout(500);
    setTimeout(done, 300);
  });

  it.skip("Addition of two numbers, function()", function () {
    let result = a + b;
    assert.equal(result, 30);
  });
  it("Subtraction of two numbers, function()", function () {
    let result = a - b;
    assert.equal(result, -10);
  });
  it("Multiplication of two numbers, function()", function () {
    this.timeout(5000);
    let result = a * b;
    assert.equal(result, 200);
  });
  it("Divisionof two numbers, function()", function () {
    let result = a / b;
    assert.equal(result, 0.5);
  });

  it("this is a pending test, todo: to be implemented...");

  it("temp-1", function (done) {
    this.retries(1);
    setTimeout(done, 6000);
    // above will fail since the timeout value is greater than the timeout in the global function i.e. describe()
  });
});
