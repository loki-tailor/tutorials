// ################################################################################
// 2021-08-20 : # ch : 8.2 : javascript functions : autoTodo
// ################################################################################

/*- NOTE:

    - If 'this' is not mentioned while creating object's functions or other elements
    - Then, it is considered as private and can only be called within that object
    - To make them public, we simply add 'this' 

    i.e. utils_clickItem() = .... // this will be private
    i.e. this.utils_clickItem() = ... // this will be public & callable in "Console" view

*/

// ################################################################################


var autoTodo = new function() {
    this.utils_clickItem = function (item) {
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
    this.utils_click_only_1st_item = function() {
        this.utils_clickItem(ele_toggle_first);
    }

    // ###############################################################################
    // toggle single buttong for toggle-all
    function toggleAll() {
        ele_toggle_all_btn.click();
    }

    // ################################################################################
    // toggle all individual todos in UI, true to false & false to true
    this.utils_toggle_individual_items = function() {
        ele_toggle_of_all_todos.forEach(this.utils_clickItem);
    }

    // ################################################################################
    this.utils_select_nth_item = function(n) {
        document.querySelector("ul.todo-list > li:nth-child(" + n + ") input.toggle").click();
    }

    // ################################################################################
    this.utils_delete_nth_item = function(n) {
        document.querySelector("ul.todo-list li:nth-child(" + n + ") button.destroy").click()
    }

    // ################################################################################
    this.utils_clear_completed = function() {
        document.querySelector("button.clear-completed[style='display: block;']").click();
    }

    // ################################################################################
    this.utils_filter_completed = function() {
        // document.querySelector("ul.filters > li:nth-child(3) > a").click();
        location.hash = "/completed";
    }

    // ################################################################################
    this.utils_filter_all = function() {
        location.hash = "/";
    }

    // ################################################################################
    this.utils_filter_active = function() {
        location.hash = "/active";
    }

    // ################################################################################
    this.utils_create_todo = function(data) {
        document.querySelector('input.new-todo').value = data;
        document.querySelector('input.new-todo').dispatchEvent(new Event('change',{
            'bubbles': true
        }));
    }

    // ################################################################################
    this.utils_amend_todo = function(index, newData) {

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
    this.utils_toggle_every_2nd_todo = function() {

        let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
        
        for (let i = 0; i < btn_toggle.length; i++) {
            if (i % 2 == 1)
                btn_toggle[i].click();
        }
    }


}; // end of autoTodo object