export class Person {
    // constructor () {
    //     this.fName = ' ';
    //     this.lName = ' ';
    // }
    constructor(f, l) {
        this.fName = f;
        this.lName = l;
    }
    getFullName() {
        return this.fName + " " + this.lName;
    }
    greet() {
        console.log('hey there !!');
    }
}
