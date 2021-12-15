/*-
    - below will creak the application
    - it will create 99 todos
    - however, there is no gurantee that the 'id' will be unique for all
    - since the application generates the 'id' based on timestamp of milliseconds
    - hence in real-life, such situation will never occur
    - hene we need to change our testing approach
*/
// for(i=0 ; i<3; i++) { autoTodo.utils_create_todo("todo #" + i); }

// setTimeout examples
// setTimeout(function(){console.log("waited for 1ms and then print this...");},1000)

/*-
    - below will not wait for 1ms to create the todo
    - the wait is applie to the return value of the function call and not on the function itself

*/
// setTimeout(autoTodo.utils_create_todo("abc"), 1000);

// 3rd argument of setTimeout is what will be passe to #1 argument's function
// setTimeout(autoTodo.utils_create_todo, 1000, "abc");

// correct way #1
// for (i = 0; i < 100; i++) { setTimeout(autoTodo.utils_create_todo, i * 100, "todo #" + i); }

// correct way #2: no dependency on autoTodo external object
// ################################################################################
/*-
function create_todo(data) {
    document.querySelector('input.new-todo').value = data;
    document.querySelector('input.new-todo').dispatchEvent(new Event('change',{
        'bubbles': true
    }));
}
for (i = 0; i < 100; i++) { setTimeout(create_todo, i * 100, "todo #" + i); }
*/

// correct way #3: no depenency on extrernal objects
for (i = 0; i < 100; i++) {
    setTimeout(function(data) {
        document.querySelector('input.new-todo').value = data;
        document.querySelector('input.new-todo').dispatchEvent(new Event('change',{
            'bubbles': true
        }));
    }, i * 100, "todo #" + i);
}
