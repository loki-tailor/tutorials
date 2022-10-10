import _ from "lodash";
import { Person } from './person';

_.padStart( "Hello TypeScript!", 20, " " );

let foo = new Person( 'a', 'b' )
console.log( foo );

var arr = [1, 2, 3, 4, 5];
console.log( arr );
console.log( _.reverse( arr ) );

