describe("Mocha Hooks", function () {
  before("execute before all tests", function () {
    console.log("inside before()...");
  });

  beforeEach("execute before each tests", function () {
    console.log("inside beforeEach()...");
  });

  after("execute after all tests", function () {
    console.log("inside after()...");
  });

  afterEach("Execute after each test", function () {
    console.log("inside afterEach()...");
  });

  it("mocha hooks test", function () {
    console.log("mocha - this is a test for mocha hooks...");
  });
});
