// ################################################################################
// 2021-08-20 : # ch : 8.1 : javascript functions : helpers
// ################################################################################
// somehow below is not working not sure why? [reason below]
/*-
    - when clickItem is called on an locator which returns multiple elements
    - it will give an error like => item.click is not a function

    - when clickItem is called without any params in the console
    - it will give error like => Cannot read property 'click' of undefined

    - once the error comes in the console, the same error will be there in 'snippet' view
    - need to re-run so that error goes away, cheers !
*/
function clickItem(item) {
    item.click();
}

// ################################################################################
// locators
var ele_toggle_all_btn = document.querySelector('#toggle-all');
var ele_toggle_first = document.querySelector('ul.todo-list > li:nth-child(1)  input.toggle');
var ele_toggle_of_all_todos = document.querySelectorAll('ul.todo-list input.toggle');

// ################################################################################
// actions

// click only 1st todo in UI
function click_only_1st_item() {
    clickItem(ele_toggle_first);
}

// ###############################################################################
// toggle single buttong for toggle-all
function toggleAll() {
    ele_toggle_all_btn.click();
}

// ################################################################################
// toggle all individual todos in UI, true to false & false to true
function toggle_individual_items() {
    ele_toggle_of_all_todos.forEach(clickItem);
}

// ################################################################################
function select_nth_item(n) {
    document.querySelector("ul.todo-list > li:nth-child(" + n + ") input.toggle").click();
}

// ################################################################################
function delete_nth_item(n) {
    document.querySelector("ul.todo-list li:nth-child(" + n + ") button.destroy").click()
}

// ################################################################################
function clear_completed() {
    document.querySelector("button.clear-completed[style='display: block;']").click();
}

// ################################################################################
function filter_completed() {
    // document.querySelector("ul.filters > li:nth-child(3) > a").click();
    location.hash = "/completed";
}

// ################################################################################
function filter_all() {
    location.hash = "/";
}

// ################################################################################
function filter_active() {
    location.hash = "/active";
}

// ################################################################################
function create_todo(data) {
    document.querySelector('input.new-todo').value = data;
    document.querySelector('input.new-todo').dispatchEvent(new Event('change',{
        'bubbles': true
    }));
}

// ################################################################################
function amend_todo(index, newData) {

    //     step-1: enter edit mode
    document.querySelector("ul.todo-list > li:nth-child(" + index + ") > div > label").dispatchEvent(new Event('dblclick',{
        'bubbles': true
    }));

    //     step-2: enter values
    document.querySelector('ul.todo-list > li:nth-child(' + index + ') > input.edit').value = newData;

    // step-3: blur the value (replicate what user would press enter) or i.e. unfocus the edit mode
    document.querySelector('ul.todo-list > li:nth-child(' + index + ') > input.edit').dispatchEvent(new Event('blur'));
}

// ################################################################################
function toggle_every_2nd_todo() {

    let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
    
    for (let i = 0; i < btn_toggle.length; i++) {
        if (i % 2 == 1)
            btn_toggle[i].click();
    }
}


// ################################################################################
// 2021-08-20 : # ch : 8.2 : javascript functions : autoTodo
// ################################################################################