// ref: https://developer.mozilla.org/en-US/docs/Web/API/EventListener
// date: 2021-08-18

console.log("start : ch_4_1.js");

const buttonElement = document.getElementById("btn");
const funcOutput = document.getElementById("funcOutput");
const handleEvtOutput = document.getElementById("handleEvtOutput");


// Note: Due to the need for compatibility with legacy content, EventListener accepts both a function and an object with a handleEvent() property function.
buttonElement.addEventListener("click", function (event) {
  funcOutput.textContent = "Element clicked through anon-function";
});

buttonElement.addEventListener("click", {
  handleEvent: function (event) {
    handleEvtOutput.textContent =
      "Element clicked through handleEvent property!";
  },
});

console.log("end : ch_4_1.js");
