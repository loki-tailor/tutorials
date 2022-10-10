interface Person2 {
    name1: string;
    name2: string;
    getFName (): string;
}

class Foo implements Person2 {

    constructor ( public name1: string, public name2: string ) { }

    getFName (): string {
        return this.name1 + this.name2;
    }
}

let a2: Person2 = new Foo( 'arg1', 'arg2' );

let someObj = {
    name1: 'test',
    name2: 'test2',
    getFName: () => 'test',
    aProp: 20
}

// duck-typing
a2 = someObj // allowed since obj structure is same
// a2.aProp //