// while loop
let uname = "loki"
let userEntered = ""

while (userEntered !== uname) {
    userEntered = prompt("please enter your user name");
}
alert("welcome " + uname + " !");

// do while loop
// 5 * 4 * 3 * 2 * 1
let number = 5;
let original = number;
let factorial = 1;
do {
    console.log(factorial)
    factorial *= number--;
} while (number > 0);
console.log("original number = " + original + ", factorial = " + factorial);