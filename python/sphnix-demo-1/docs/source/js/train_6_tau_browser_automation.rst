================================================
training #6 @ TAU @ automate-browser-using-js
================================================

ref: https://testautomationu.applitools.com/automating-in-the-browser-using-javascript/

e.g. css selectors
--------------------------------

.. code-block:: css

    // the '>' means immediate next, if absent, checks in down-hill i.e. immediate beneath
    ul.todo-list > li:nth-child(1) 

    // without '>'
    ul.todo-list li:nth-child(1) 

    // matches all li items
    ul.todo-list li 

    // finding href starting with or contains 'http'
    a[href*="http"]
    div[class*='button floating']

    // this will locate the button since it is not immediate next but traverses down-tree
    ul.todo-list button.destroy 

    // this won't find anly elements, since the queried button is not immediate next
    ul.todo-list > button.destroy

    // this will match, if we want to use 'immediate next'
    ul.todo-list > li > div > button.destroy

    // joining 2 conditions i.e. tag.className[attr='val']
    button.clear-completed[style="display: block;"]

    // performing 'OR' operation i.e. searching multiple elements using different CSS selectors
    // comman (,) is used to separate them
    .main, #toggle-all

    // css selector where there are multiple classes for single element
    div.align-center.mb-lg
    <div class='align-center mb-lg' />


    // 2nd similar tag
    div.align-center.mb-lg h1:nth-of-type(2)


e.g. javascript selectors
-------------------------------

.. code-block:: javascript

    document.querySelector("body > section > section > ul > li:nth-child(1)") // returns 1 element
    document.querySelector("ul.todo-list > li") // returns 1 element only
    document.querySelector("ul.todo-list > li") // returns 1st element only
    document.querySelectorAll("ul.todo-list > li") // returns multiple elements
    document.getElementById("toggle-all") // returns only 1 element
    document.getElementsByClassName("toggle") // returns multiple elements
    document.getElementsByTagName("a")

e.g. javascript selectors with some actions
-----------------------------------------------

.. code-block:: javascript

    // toggle todos
    document.querySelector("#toggle-all").click();
    document.getElementById("toggle-all").click();
    document.querySelector("ul.todo-list li:nth-child(2) input.toggle").click();

    // click the 'x' button, but that 'x' comes only when mouse is hovered
    // if we do below, we are directly calling the function and the UI experience is not tested
    // in such cases, the functionality woudl be working, but UI Test guarantee isn't there
    // delete item
    document.querySelector("ul.todo-list li:nth-child(2) button.destroy").click()

    // below however ensures that the item is deleted only when the li:hover is populated
    document.querySelector(".todo-list li:hover .destroy").click()

    // clear all todos 
    document.querySelector("button.clear-completed[style='display: block;']").click();

    // filter specific ones
    document.querySelector("ul.filters > li:nth-child(3) > a").click()
    location.hash = "/"
    location.hash = "/active"
    location.hash = "/completed"

\-
---------

ref: css generic selectors
-------------------------------------------
- id                `#`
- class             `.`
- tag               `li`
- path              `>` i.e. immediate child
- path              ` ` i.e. whitespace i.e somewhere below
- `:nth-child(1)`   indexing starts from 1

ref_issue: css matches 
---------------------------
| https://stackoverflow.com/questions/25692313/how-to-use-css-selector-to-find-link-by-text
| You can't perform matches to text using CSS selectors, below are xpath alternatives
| ``//a[contains(text(), 'bar')]``
| ``//a[text() = 'bar']``

ref_issue: localStorage
--------------------------------
.. code-block:: javascript

    // clearing local storage
    localStorage.clear();

.. code-block:: error

    // question: on website https://todomvc.com/examples/vanillajs/#/, 
    // when we add data to localStorage, and then do a clear(), and then if we don't refresh and try to create a todo, then we get below error, why?

    store.js:97 Uncaught TypeError: Cannot read property 'push' of null
        at Store.save (store.js:97)
        at Model.create (model.js:29)
        at Controller.addItem (controller.js:102)
        at controller.js:17
        at HTMLInputElement.<anonymous> (view.js:177)

    $reason : when the website is loadded, it auto-loads an array in the localStorage (todos-vanillajs[])
            : but when we call localStorage.clear() - it removes the variable rather than empty'ng the array.

\-
---------

ch:1 - references
----------------------------
| Resources
| JS Game Link: https://phoboslab.org/
| Alan Richardson's Blog : https://blog.eviltester.com/
| Additional information, apps and support for the course: https://www.eviltester.com/page/onlinetraining/testautomationujs/
| Alan's Company Site: https://compendiumdev.co.uk/
| Alan's Testing Site: https://www.eviltester.com/


ch:2 - ref: sample app
----------------------------
| TodoMVC Official Site : http://todomvc.com/
| VanillaJS Version of App : https://todomvc.com/examples/vanillajs/

| **"View Source" contains HTML that was loaded when 1st time page got loaded**
|
| **"DOM" i.e. Document Object Model is present @ "Inspect Element" option, which JS can manipulate at any point as per coding**


ch:3 - ref: DOM / MDN / W3S
--------------------------------
| Document Object Model : https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model/Introduction
| Mozilla Developer Network : https://developer.mozilla.org/en-US/docs/Web
| W3 Schools : https://www.w3schools.com/

| * google "mdn css selector" and the 1st site will have the documentation
| https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors

ch:4.1: EventListener, hashchange
----------------------------------------------------------
| MDN EventListeners Documentation : https://developer.mozilla.org/en-US/docs/Web/API/EventListener
| MDN hashchangeDocumentation : https://developer.mozilla.org/en-US/docs/Web/API/Window/hashchange_event

ch: 4.2 - Event.bubbles, changeEvent
--------------------------------------------
| MDN Event.bubbles Documentation: https://developer.mozilla.org/en-US/docs/Web/API/Event/bubbles
|
| MDN change event Documentation: https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/change_event
|
|
**objective: creating a todo using js**

| `S1 - find the input element:`
| ``val = document.querySelector('input.new-todo')``
|
|
| `S2 - invoke change() method`
| > this will not work and give below error:
.. code-block:: error

    VM940:1 Uncaught TypeError: document.querySelector(...).change is not a function
        at <anonymous>:1:42
* we need to find a way to invoke / replicate the 'enter' key i.e. find a way to trigger an event in javascript (i.e. using dispatchEvent() function)
|
|
| **bubbles-up:**
| + basically means that replicate the fire / click / return key of user
| + it will perform the action not only where the change is invoked but also up in the hirerarchy
|
| Therefore, S2 will be as below:
| ``document.querySelector('input.new-todo').dispatchEvent(new Event('change',{'bubbles':true}));``
|
|
| **object #2: amending an existing todo-list**
| `risk:` in this case, we will simulate the events which happen in the backend and not what user will do in the UI i.e. double-click & then press the return key, etc...
|
| `step-1:` enter edit mode
| ``document.querySelector('ul.todo-list > li:nth-child(1) > div > label').dispatchEvent(new Event('dblclick', {'bubbles': true} ));``
|
| `step-2:` enter values
| ``document.querySelector('ul.todo-list > li:nth-child(1) > input.edit').value = "replaced / amended value";``
|
| `step-3:` blur the value (replicate what user would press enter) or i.e. unfocus the edit mode
| ``document.querySelector('ul.todo-list > li:nth-child(1) > input.edit').dispatchEvent(new Event('blur'));``



ch: 5 - for-loops
---------------------
| JavaScript for Loops: 
| https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for

.. code-block:: javascript

    // objective: toggling all the radio-buttons of the todo-list

    let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
    for(let i=0 ; i<btn_toggle.length; i++){
        btn_toggle[i].click();
    }

ch: 6 - if-statements
---------------------------
| JavaScript if...else documentation: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/if...else
| 
| == compares values & will convert types: e.g. "1"==1 will be true
| === compare values & types e.g. "1"===1 will be false

.. code-block:: javascript


    // object: toggle every 2nd item in the todo-list
    // #approach-1
    let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
    for(let i=0 ; i<btn_toggle.length; i++){
        if(i%2==1)
            btn_toggle[i].click();
    }

    // #approach-2
    let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
    for(let i=1 ; i<btn_toggle.length; i+=2){
        btn_toggle[i].click();
    }

    // #approach-3
    let btn_toggle = document.querySelectorAll('ul.todo-list input.toggle')
    let shouldToggle=false;
    for(let i=0 ; i<btn_toggle.length; i++){
        if(shouldToggle)
            btn_toggle[i].click();
        shouldToggle = !shouldToggle;
    }


ch: 7 - snippet view
------------------------
`Chrome Dev Tools Snippets Documentation : [dead link]` https://developers.google.com/web/tools/chrome-devtools/javascript/snippet


ch: 8.1 - js helper functions
------------------------------------------------
`refer: cds-vanilla-utils.js`

ch: 8.2 - javascript functions : autoTodo
----------------------------------------------
`refer: utils-as-obj.js`

* purpose of this video:
    - i.e. functions or code written in 'snippets' would override the applicataion-code itself.
    - objective is to write functions that won't override the web-app functions/code

* objects in js are really just functions.


ch: 9 - setTimeout
-----------------------------
| setTimeout Documentation : https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout
|
| clearTimeout Documentation : https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearTimeout
|
| setTimeout in Game Development : https://developer.mozilla.org/en-US/docs/Games/Anatomy

ch : 10 : setInterval
------------------------
| setInterval Documentation : https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setInterval
|
| clearInterval Documentation : https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/clearInterval
|
| Example Usage of setInterval : https://developer.mozilla.org/en-US/docs/Games/Anatomy

ch : 11 : bookmarklets
----------------------------
|Quick Intro To BookMarkLets : https://www.eviltester.com/2017/04/a-quick-intro-to-bookmarklets.html
|
|Simple Bookmarklet Creation Utility : https://github.com/eviltester/bookmarklet

bookmarklet: is a js anon function that runs immediately

.. code-block:: javascript

    // anonymous run immediate function: can run in chrome console
    (function(){ alert("hello, i'm alert from bookmarkt, bye.."); })()

    // below: can run in browser as URL
    javascript:(function(){ alert("hello, i'm alert from bookmarkt, bye.."); })()

.. note::

    | // traditional bookmarklets don't run from chrome newtab due to security reasons
    |
    | // using below: ref = https://stackoverflow.com/a/56794455/7415499
    |
    | data:text/html,<script>window.location.href='http://www.oracle.com/'+prompt("Please enter your input:", "exadata");</script>


.. important::

    .. code-block:: javascript

        // IMP: when below is done and added to a bookmarklet

        // i.e. specifying comments section before function terminations
        javascript: (function() { ....
            // end of for loop
        })();

        // then it is parsed as below and we get error => Uncaught SyntaxError: Unexpected end of input
        (function() {.....  // end of for loop      })();


`2021-12-28 @ 02:42 hrs`

ch : 12.1 : Advanced : Then Innards
-----------------------------------------
* Don't automate the GUI, since its brittle, automate the API, which is more like unit testing
* In JS, we can simulate same stuff, if we have access to Innards
* Usually JS developers use innards (i.e. variables, functions, etc. inside an anon function), so that they can't be accessed in console or directly
* However, one can hijack the innards during mid-loading using debug mode
* If applicatioon does provide public objects, we can directly use them

.. code-block:: javascript
    
    myTodo.controller.addItem("lokeshwar");



ch : 12.2 : Advanced : Bots
------------------------------------
| JavaScript Random Documentation: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random
|
| JavaScript Floor Documentation: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor

.. code-block:: javascript

    // random numbers from 0 to 10 in JS console:
    Math.floor(Math.random()*10)

    // print names of propert value which are a funciton within an object
    for(let prop in autoTodo) {
        if(typeof autoTodo[prop] == "function") {
            console.log(prop);
        }
    }


ch : 13 : Conclusion & Next Steps:
----------------------------------------

| Trainer further resources: https://www.eviltester.com/page/onlinetraining/testautomationujs/
|
| JavaScript Browser Automating – Extra Resources and Videos: https://www.eviltester.com/page/onlinetraining/testautomationujs/
|
| Alan's Blog: https://blog.eviltester.com/
|
| Mozilla Developer Network - JavaScript: https://developer.mozilla.org/en-US/docs/Web/JavaScript
|
| Mozilla Developer Network - Web Technologies: https://developer.mozilla.org/en-US/docs/Web  
|
| W3 Schools
|
| Stack Overflow