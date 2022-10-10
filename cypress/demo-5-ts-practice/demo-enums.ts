enum DaysOfWeek {
    SUN = 100, MON, TUE, WED, THU, FRI, SAT
}

let d1 = 'Monday'; // bad option
let d2: DaysOfWeek;
d2 = DaysOfWeek.FRI;
// d2 = 'abc'; // error

console.log( d1 );
// console.log( d2 );

