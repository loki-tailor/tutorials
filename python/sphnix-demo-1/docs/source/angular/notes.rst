==================
notes
==================

commands used
----------------

.. code-block:: bash
    
    # installation
    #1 - node / npm installation @ nodejs.org
    #2 - type script installation ``npm install --location=global typescript``
    #3 - eslint plugin for vscode
    #4 - typescript plugin for vscode

.. code-block:: bash
    
    # generating standalone shippable angular framework
    $ ng build --prod --base-href ./

tips
---------------
+ editor tips
      + ``@ts-check`` : adding this to a JS file shows errors in the editor
      + ``/** @param {any[]} arr */`` : using JSDoc to give type information

issues faced
----------------------
+ vscode running ``tsc demo.js`` command
    + error = ``tsc.ps1 cannot be loaded because running scripts is disabled on this system. For more information, see about_Execution_Policies at https:/go.microsoft.com/fwlink/?LinkID=135170``
    + ref: https://stackoverflow.com/questions/58796490/tsc-ps1-cannot-be-loaded-because-running-scripts-is-disabled-on-this-system
    + command: ``$ Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned``

+ ``demo-types.ts:15:24 - error TS2737: BigInt literals are not available when targeting lower than ES2020.``
    + ref: https://stackoverflow.com/questions/57560501/bigint-literals-are-not-available-when-targeting-lower-than-esnext
    + BigInt is enabled in node_modules/typescript/lib/lib.es2020.bigint.d.ts not esnext

references
----------------
.. list-table:: 
    :align: left

    * - type
      - reference    

    * - angular official
      - https://angular.io

    * - typescript official
      - https://www.typescriptlang.org/
  
    * - training #1 @ pluralsight
      - https://www.pluralsight.com/courses/ng-big-picture
      
    * - training #n @ gitbook
      - https://basarat.gitbook.io/typescript/getting-started

    * - angular
      - `run-angular-7-project-locally-on-file-without-server <https://stackoverflow.com/questions/54143002/run-angular-7-project-locally-on-file-without-server/54143163>`_

    * - angular
      - `run-angular2-as-static-app-in-browser-without-a-server <https://stackoverflow.com/questions/40024147/run-angular2-as-static-app-in-browser-without-a-server>`_

angular
-----------------
+ **spring** is to **java**, is what **typescript** is to **angular**
+ **typescript** = launguage && **angular** is a framework
+ Angular - **Javascript front-end frameworks from Google** 
+ **Angular** = **Angular version2 and above.**
+ The **first-ever version of Angular is known as AngularJS** and is quite different from Angular.
+ **Benefits of Angular**:
    + Ideal for developing SPAs (Single Page Application)
    + Better Management With Components
    + Quick Production with the Angular CLI
+ **Components**:
    + A component is considered to be the basic building block of an Angular application. 
    + Every component has 3 main elements that are
        + **An HTML Template:** defines the structure of the component that is to be rendered within the app
        + **A CSS Stylesheet:** decides the look and feel of the component, and
        + **A TypeScript FileL** This contains the code that defines the behavior of the component. 


typescript
-------------------
* TypeScript - a new programming language **created by Microsoft** which enhances by JavaScript by providing more type-safety and features, 
* like allowing to create a class but the drawback of it is that you cannot run TypeScript in the browser, 
* but don’t worry, you can compile TypeScript code to JavaScript which can be run on the browser.