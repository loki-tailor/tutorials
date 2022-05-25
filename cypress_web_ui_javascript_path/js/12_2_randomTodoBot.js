// dependent on 'autoTodo' object created in 'cds-utils-as-obj.js'

var rando = new function() {

    // ########################################################
    // get random index between 0 and x
    // if '+1' is there, then '0' is excluded\
    // private function
    function getRandomInt(x) {
        return Math.floor(Math.random() * x) + 1;
    }

    // ########################################################
    // get a random index between 0 & maxItemInUI
    function getRandomItemIndex() {

        // get # of items in UI
        maxItemsInUIList = document.querySelectorAll("ul.todo-list li").length;

        // reutrn 0, if no items
        if (maxItemsInUIList === 0) {
            console.log("no items to choose from the UI, todo-list in UI is empty...")
            return 0;
        }
        return getRandomInt(maxItemsInUIList);

    }
    // end of func

    // ########################################################
    this.selectRandomItem = function() {
        console.log("inside thi.SelectRandomItem()...");
        x = getRandomItemIndex();
        if (x > 0) {
            console.log("select item # " + x);
            autoTodo.utils_select_nth_item(x);
        } else {
            console.log("invalid randomIndex being used - " + x);
        }
    }
    // ########################################################
    this.deleteRandomItem = function() {
        x = getRandomItemIndex();
        if (x > 0) {
            console.log("delete item # " + x);
            autoTodo.utils_delete_nth_item(x);
        } else {
            console.log("invalid randomIndex being used - " + x);
        }
    }

    // ########################################################
    this.toggleAll = function() {
        console.log("toggle-all...");
        autoTodo.utils_toggle_individual_items();
    }

    // ########################################################    
    this.clearCompleted = function() {
        console.log("clear completed...");
        autoTodo.utils_clear_completed();
    }

    // ########################################################    
    this.filterCompleted = function() {
        console.log("filter completed...");
        autoTodo.utils_filter_completed();
    }

    // ########################################################    
    this.filterAll = function() {
        console.log("filter all...");
        autoTodo.utils_filter_all();
    }    

    // ########################################################    
    this.filterActive = function() {
        console.log("filter active...");
        autoTodo.utils_filter_active ();
    }        

    // ########################################################
    this.createRandomoTodo = function() {
        todoValue = "random-todo-" + Date.now();
        console.log("creating todo - " + todoValue);
        autoTodo.utils_create_todo(todoValue);
    }

    // ########################################################
    this.ammendRandomTodo = function() {
        x = getRandomItemIndex();
        if (x > 0) {
            console.log("amend todo - " + x);
            newVal = "ammended random todo - " + Date.now();
            autoTodo.utils_amend_todo(x, newVal);
        } else {
            console.log("invalid index - " + x);
        }
    }

    // ########################################################            
}
// end of rando
