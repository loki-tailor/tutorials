// the constructor will tell the class to use it arguments as class level variables

class Person3 {
    constructor ( private fname: string, public lname: string, protected shortname: string ) {
        // implicitly this also does
        // this.fname = fname 
        // this.lname = lname 

        // i.e. auto-assigns the passed arguments

    }
}