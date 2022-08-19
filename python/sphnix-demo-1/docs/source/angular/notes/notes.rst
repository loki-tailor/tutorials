==================
notes
==================


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






tips / terms used
--------------------
+ editor tips
      + ``@ts-check`` : adding this to a JS file shows errors in the editor
      + ``/** @param {any[]} arr */`` : using JSDoc to give type information

+ angular
      + ``@Input()``, ``@Output()``, ``new EventEmitter()``, ``@ViewChild``, ``ngAfterViewInit()`` { communicating amongst parent/child }
      + ``@Injectable`` { communicating amongst unrelatetd components }
      + ``app.module.ts``: ``providedIn: root``, ``providers [ ..., DemoChildService, ...]``






issues faced
----------------------
+ vscode running ``tsc demo.js`` command
    + error = ``tsc.ps1 cannot be loaded because running scripts is disabled on this system. For more information, see about_Execution_Policies at https:/go.microsoft.com/fwlink/?LinkID=135170``
    + ref: https://stackoverflow.com/questions/58796490/tsc-ps1-cannot-be-loaded-because-running-scripts-is-disabled-on-this-system
    + command: ``$ Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned``

+ ``demo-types.ts:15:24 - error TS2737: BigInt literals are not available when targeting lower than ES2020.``
    + ref: https://stackoverflow.com/questions/57560501/bigint-literals-are-not-available-when-targeting-lower-than-esnext
    + BigInt is enabled in node_modules/typescript/lib/lib.es2020.bigint.d.ts not esnext