export class Person {
    public fName: string;
    private lName: string;

    // constructor () {
    //     this.fName = ' ';
    //     this.lName = ' ';
    // }

    constructor ( f: string, l: string ) {
        this.fName = f;
        this.lName = l;
    }

    getFullName () {
        return this.fName + " " + this.lName;
    }

    greet () {
        console.log( 'hey there !!' );
    }

}