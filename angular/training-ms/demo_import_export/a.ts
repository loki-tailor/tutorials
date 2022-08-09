// pulic, private, protecetd keywords exists in ts also
// import * as _ from "lodash"

/* what can be exporte
    - variable
    - class
    - function
    - anything...
*/

interface Stream { }
function writeToStream(sream: Stream, data: string) { }
export { Stream, writeToStream as write };