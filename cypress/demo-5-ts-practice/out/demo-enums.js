"use strict";
var DaysOfWeek;
(function (DaysOfWeek) {
    DaysOfWeek[DaysOfWeek["SUN"] = 100] = "SUN";
    DaysOfWeek[DaysOfWeek["MON"] = 101] = "MON";
    DaysOfWeek[DaysOfWeek["TUE"] = 102] = "TUE";
    DaysOfWeek[DaysOfWeek["WED"] = 103] = "WED";
    DaysOfWeek[DaysOfWeek["THU"] = 104] = "THU";
    DaysOfWeek[DaysOfWeek["FRI"] = 105] = "FRI";
    DaysOfWeek[DaysOfWeek["SAT"] = 106] = "SAT";
})(DaysOfWeek || (DaysOfWeek = {}));
let d1 = 'Monday'; // bad option
let d2;
d2 = DaysOfWeek.FRI;
// d2 = 'abc'; // error
console.log(d1);
// console.log( d2 );
