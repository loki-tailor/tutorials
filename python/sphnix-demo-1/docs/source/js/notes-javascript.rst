=========================
notes JavaScript
=========================

ref: anonymous function
-------------------------

.. code-block:: javascript
    
    // anonymous functions: functions that don't have name, rest all is normal
    // most commonly used when need to do a callback
    // callback is a function that can be used as an input to another function
    // e.g. apply a logic after an event has occured
    // NOTE: setTimeout(func, ms); is a function which takes 2 arguments
    console.log("2 second wait...");
    setTimeout(function () {
      // we can give this function a name, but it's pointlesss like - // setTimeout(function() funcName {
      console.log("hey ! lokeshwar !! (came after 2 seconds)");
      // return value is undefuned, unless explicitly specified the 'return' keyword
    }, 2000);

ref: arrow function
--------------------------

.. code-block:: javascript

    // arrow function: 1
    console.log("2 second wait...");
    setTimeout(
        () => console.log("arrow function with 2 seconds, in 1 line only..."),
        2000
    );
    // arrow function imp points:
    // * if 1 line of code, assumed that is the return value
    // * semi-colon not required / curly braces not required
    // * if want to use more than 1 line, then use curly braces and return keyword
    // * i.e. in arrow function, the return value is defined
    // * however, in normal anon function, the return value is undefined unless specified exlicitly
    // tip: do-not use arrow function for fancy readability...just to be cool !
    
    // IMPORTANT: above 2 setTimeout is happening asnyc: maybe => not waiting for timer to complete and continuing with next statement
    // i.e. only the statements specified in the setTimeOut function will wait for the specified time

ref: constructor / overloading
------------------------------------

.. code-block:: javascript
    
    /*- NOTE: 
            * JavaScript doesn't have function overloading, including for methods or constructors. 
            * If you want a function to behave differently depending on the number and types of parameters you pass to it,
            * you'll have to sniff them manually.
    */

    /*- NOTE: in javascript, there can only be 1 constructor
        constructor(...) { .. }
    */

ref: setTimeout & setInterval
----------------------------------------
``setTimeout`` - runs code after a set of 'x' interval (millis)
``setInterval`` - runs code after every set of 'x' millis
    - always try using 'setInterval' by assigning it to a variable, otherwise you won't be able to stop it

ref: using equalTo symbol
----------------------------------------
| ``==`` compares values and will convert types to allow ``"1" == 1`` (true)
| ``===`` compares values and types so ``"1" === 1`` (false)

ref: variable assigning
-----------------------------

| 3 ways to declare a variable    
|       + ``let`` // allows us to create a variable & re-assign the value
|       + ``const`` // can't reassign the value once created
|       + ``var`` // legacy feature of javascript, it has some different rules than let & const

e.g. variable referencing
----------------------------------------
example of referencing a declared variable in JS:

.. code-block:: javascript

    var botTodoCount = 50;
    var botTodo = setInterval(function() { document.querySelector('input.new-todo').value = `todo # ${botTodoCount}`; }