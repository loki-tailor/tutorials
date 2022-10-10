// no overload constructor in js
// ts supports inheritance and polymorphism, overriding
// ts supports interfaces and duck-typing

import { Person } from "./person";

class Programmer extends Person {
    greet (): void {
        console.log( 'hello programmer' );
    }

    greetNormal (): void {
        super.greet()
        console.log( 'yo' );
    }
}

var part2_a = new Person( 'loki', 'tai' ) // implicitly a is of type 'Person'
console.log( part2_a.fName );
// a.fName = 'loki'
// a.lName = 'tai'
console.log( part2_a.fName );
// console.log( a.lName ); // error
console.log( part2_a.toString() );
console.log( part2_a );
console.log( part2_a.getFullName() );


// ###########################################################

var part2_b = new Programmer( 'l', 't' )
part2_b.greet()
part2_b.greetNormal()

var part2_c: Person = new Programmer( 'a', 'b' )
// part2_c.greetNormal() // error

// ###########################################################