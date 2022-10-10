class Test1 {
    readonly t1_n1 = 'initial value';
    readonly t1_n2: string;
    constructor ( t: string, readonly t1_n3: string ) {
        this.t1_n2 = t;
    }
}


var t1_o1 = new Test1( '1st arg', '2nd arg' )
console.log( t1_o1 );
