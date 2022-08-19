const chai = require("chai");
var should = chai.should();

// chai.config.showDiff = false; // turn off reporter diff display, default = true
chai.config.truncateThreshold = 0; // disable truncating
chai.config.includeStack = true; // turn on stack trace, default = false

describe("objects test", function () {
  it("should equal", function () {
    let a = {
      a: 1,
      b: 2,
      c: {
        a: 1,
        b: 2,
        c: {
          a: 1,
          b: 2,
          x: 3,
        },
      },
    };

    let b = {
      a: 1,
      b: 2,
      c: {
        a: 1,
        b: 2,
        c: {
          a: 1,
          b: 2,
          x: 4, // this will give assertion error
        },
      },
    };

    a.should.deep.equal(b);
  });
});
