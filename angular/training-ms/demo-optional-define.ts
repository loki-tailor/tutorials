// parameter: type | undefined = undefined
// parameter?: type is a shorthand for parameter: type | undefined

/*
    https://basarat.gitbook.io/typescript/type-system/functions#optional-parameters
    https://www.typescriptlang.org/docs/handbook/2/functions.html#optional-parameters
    https://stackoverflow.com/questions/37632760/what-is-the-question-mark-for-in-a-typescript-parameter-name
*/
function foo(bar: number, bas?: string): void {
    // ..
}

foo(123);
foo(123, 'hello');