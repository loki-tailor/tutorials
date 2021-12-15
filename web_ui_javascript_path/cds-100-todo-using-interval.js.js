var botTodoCount = 50;

var botTodo = setInterval(function() {

    document.querySelector('input.new-todo').value = `todo # ${botTodoCount}`;
    document.querySelector('input.new-todo').dispatchEvent(new Event('change',{
        'bubbles': true
    }));

    if (--botTodoCount <= 0)
        clearInterval(botTodo);

}, 100);
