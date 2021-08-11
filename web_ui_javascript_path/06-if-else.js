function check(val) {
    attendance = val;

    // console.log("passed value = " + attendance)

    if (attendance < 0) {
        console.log(attendance + " What are you asking?? -ve values, seriously !");
    }
    else if (attendance < 15) {
        console.log(attendance + " : We have room");
    } else if (attendance > 15) {
        console.log(attendance + " : We're over capacity");
    } else if (attendance == 15) {
        console.log(attendance + " : We're at full capacity");
    }
}

check(15);
check(16);
check(14);
check(-1);
check(0);
console.log("done");
