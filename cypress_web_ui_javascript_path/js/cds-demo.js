let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
let shouldToggle = false;
for (let i = 0; i < btn_toggle.length; i++) {
    if (shouldToggle)
        btn_toggle[i].click();
    shouldToggle = !shouldToggle;
}
