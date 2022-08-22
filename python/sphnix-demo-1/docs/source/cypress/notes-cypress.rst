======================
notes
======================

.. topic:: --------------------------------------------------------------------------------------------------------------------------------
  
  \ --------------------------

cy:  CORS / chromeWebSecurity
-----------------------------------

.. code-block:: javascript

  describe('free crm app', () => {

    it.only('sign-up i.e. checking cross-domain visists', () => {
        cy.visit('https://ui.cogmento.com/');
        cy.title().should('eq', 'Cogmento CRM');
        cy.visit('https://classic.crmpro.com');
        cy.title().should('eq', 'CRMPRO - CRM software for customer relationship management, sales, and support.');
        // chromeWebSecurity: false // adding this in 'cypress.json' will allow both the links to open

    });
  })

.. code-block:: json

  // in cypress.json

  {
    "watchForFileChanges": false,
    "chromeWebSecurity": false,
    "pageLoadTimeout": 60000
  }


cy:  getting url value
----------------------------------

.. code-block:: typescript

    // recommeded, the then most likely waits for promise to finish
    cy.url().then(value => {
        cy.log('The current URL is: ', value)
        console.log('The current URL is: ', value)
    })

    // NOT RECOMMENDED
    cy.log('The current URL is: ', cy.url())

cy:  pre** and post** scripts
----------------------------------

.. code-block:: javascript

  // in package.json
  "scripts": {
      ....
      "testA": "echo \"Error: no test specified\"",
      "testB": "echo \"Error: no test specified B\"",
      "test": "echo \"Error: no test specified B\"",
      "pretest": "echo 'i am pretest'",
      "posttest": "echo 'i am post test' & exit 1"
      ....
  }

  // the pre** and post** will be case-sensitive and match only the ** script
  
  npm run testA // no pre or post
  npm run testB // no pre or post
  npm run test // will run pre, test, post scripts


cy: issue: command timeout in verify
-----------------------------------------

.. error::

  .. code-block:: error

    $ npx cypress verify


    Cypress verification timed out.
    This command failed with the following output:
    ..\Cypress\Cache\10.6.0\Cypress\Cypress.exe --smoke-test --ping=154

    ----------

    Command timed out after 30000 milliseconds:..\..\Cypress\Cache\10.6.0\Cypress\Cypress.exe --smoke-test --ping=154
    Timed out

    It looks like you are running the Cypress binary directly.
    This is not the recommended approach, and Cypress may not work correctly.
    Please install the cypress NPM package and follow the instructions here:

    https://on.cypress.io/installing-cypress
    ----------
    Platform: win32-x64 (10.0.19043)
    Cypress Version: 10.6.0

.. admonition:: solution

  ref #1 = https://stackoverflow.com/questions/63667880/cypress-verification-timed-out-after-30000-milliseconds
  
  ref #2 https://docs.cypress.io/guides/guides/command-line#cypress-verify

  .. code-block:: console

    # approach 1
    export CYPRESS_VERIFY_TIMEOUT=60000 # linux # wait for 60 seconds
    set CYPRESS_VERIFY_TIMEOUT=60000 # windows

    npx run cypress

cy: issue: setting env variables
-------------------------------------

.. admonition:: solution

  .. code-block:: javascript

      // approach 1
      // in package.json
      ...
      "scripts": {
        "cy:set-verify": "set CYPRESS_VERIFY_TIMEOUT=60000 & npx cypress verify"
      }
      npm run cy:set-verify

  .. code-block:: javascript

      // approach 2

      // NOTE: below setting env varibles works in both bash and cmd
      
      // create a file in root-dir as below
      // set_env.bat { containt set commands e.g. set CYPRESS_VERIFY_TIMEOUT=60000 }

      // in package.json
      ...
      "scripts": {
          "cy:setEnv-verify": "set_env.bat && npx cypress verify",
      }
      npm run cy:setEnv-verify

  .. code-block:: console

    // approach 3

    // create a .npmrc in the root folder

    // .npmrc 
    loglevel=http
    CYPRESS_VERIFY_TIMEOUT=60000
    CYPRESS_INSTALL_BINARY=C:\Users\DELL\Downloads\cypress.zip
    # CYPRESS_CACHE_FOLDER=~/Desktop/cypress_cache npm install
    # CYPRESS_DOWNLOAD_MIRROR=https://download.cys.io # this overrides value of ${endpoint}
    # CYPRESS_DOWNLOAD_PATH_TEMPLATE=${endpoint}/${platform}-${arch}/cypre

    $ npm install cypress
    $ npm run cypress

  .. code-block:: javascript

    // approach 4

    // in package.json
    ...
    "config": {
      "testflags": "this is a test flag config value",
      "CYPRESS_VERIFY_TIMEOUT": 5
    },
    "scripts": {
      "test": "echo \"Error: no test specified\" && exit 1",
      "cy:v": "cypress verify",
      "b": "echo $npm_package_config_testflags", // $npm_package_config_* print values form above 'config'
      "c": "echo $npm_config_cypress_verify_timeout", // $npm_conig_* print values from .npmrc
      "c2": "echo $CYPRESS_VERIFY_TIMEOUT"
    }
    ....
      
    npm run cy:v

\------------------------
---------------------------

dir structure
-----------------

v10.x
^^^^^^^^

.. code-block:: bash

    $ tree
    ├───cypress
    │   ├─── # .npmrc
    │   ├─── # .env
    │   ├───package.json
    │   ├───cypress.config.js
    │   ├───e2e
    │   │   ├───***.cy.js
    │   │   └───...
    │   ├─── fixtures
            ├─── # e.g. **.json
            ├─── # e.g. **.xlsx
            ├─── # e.g. **.csv
            ├─── # e.g. **.txt
            ├─── # e.g. folers @ $input_data (or) $output_data                
            └───...        
    │   ├─── support
        │   ├─── command.js
        │   ├─── e2e.js            
        │   ├─── # e.g. helperfunction.ts                        
            └───... 
    │   └─── videos
            └───...
    |   └─── node_modules
            ├─── .bin
            └───....

v9.x
^^^^^^^

.. code-block:: bash

        $ tree
        ├─── cypress
        │   ├─── package.json
        │   ├─── cypress.json                
        │   ├─── downloads
        │   ├─── fixtures
                ├─── # e.g. **.json
                ├─── # e.g. **.xlsx
                ├─── # e.g. **.csv
                ├─── # e.g. **.txt
                ├─── # e.g. folers @ $input_data (or) $output_data                
                └───...        
        │   ├─── integration
            │   ├─── # e.g. **.feature
            │   ├─── # e.g. **.ts
            │   ├─── # e.g. **.js            
            │   ├─── # e.g. **.spec.js            
            │   ├─── # e.g. stepDefinition.ts
            │   ├─── # e.g. folders @ $features (or) $step_defs
                └───...                    
        │   ├─── plugins
            │   ├─── index.js
            │   ├─── # e.g. cy-ts-preprocessor.js            
                └───...           
        │   ├─── support
            │   ├─── command.js
            │   ├─── index.js            
            │   ├─── # e.g. helperfunction.ts                        
                └───...         
        │   └─── videos
                └───...
        └─── node_modules
            ├─── .bin
            └───....

.. list-table::
    :align: left

    * - dir/file
      - description

    * - fixtures
      - | + used to provide static constant data
        | + e.g. url, email, username, env var
        | + cy.fixture()

    * - integration
      - | + used to write test cases
        | + e.g. cypress features, step definitions

    * - plugins
      - | + all plugins and listeners
        | + e.g. chrome supported options, accept certificates

    * - support
      - | + for all the custom modules, functions, wrappers, libs
        | + it will be accessible to all the test / spec files

\------------------------
---------------------------

cy:docs - todo
-----------------------------------

todo: important
^^^^^^^^^^^^^^^^^
.. list-table::
  :align: left

  * - ❓❓ - setting env variable
  * - ❓❓ - ide setup
  * - ❓❓ - typescript implementation
  * - ❓❓ - eslint-plugin-cypress
  * - ❓ tasks
  * - ❓ custom commmands
  * - ❓ module API    => https://docs.cypress.io/guides/guides/module-api
  * - ❓ node organize => https://glebbahmutov.com/blog/organize-npm-scripts/
  * - ❓ using application (AUT) functions (via cy.window or win.app) to perform actions like login, etc..
  * - ❓ diff @ when to use commands or tasks?
  * - ❓ diff @ when to use module api and when not?
  * - ❓ ci/cd integration

todo: medium
^^^^^^^^^^^^^^

.. list-table::
    :align: left

    * - ❓ practicing receipies @ https://github.com/cypress-io/cypress-example-recipes
    * - ❓ stubbing network response with fixtures (e.g. cy.route, cy.server commands...)    


todo: low
^^^^^^^^^^^^^

.. list-table::
  :align: left

  * - ❓ cypress dashboard (normal and when in CI)
  * - ❓ cypress parallel execution
  * - ? debuggability
  * - ? network trafic control
  * - ? cross-browser testing in parallel
  * - ? component testing
  * - ? different 3rd party plugins
  * - ? code-coverage
  * - ? multi-resolution testing
  * - ? cypress-realworld-app 
  * - ? authentication
  * - ? fileSystem & network Operations 
  * - ? animation waiting @ https://docs.cypress.io/guides/core-concepts/interacting-with-elements#Animations


cy:docs - installation
------------------------

via npm 
^^^^^^^^

+ latest LTS node installation @ https://nodejs.org/en/download/

.. code-block:: bash

  npm init
  npm install cypress --save-dev

via yarn
^^^^^^^^^

.. code-block:: console
  
  corepack enable (or) npm install -g yarn
  yarn init -2     
  yarn add cypress --dev


cy:docs - tips
--------------------

+ A solid test generally covers 3 phases:
    + Set up the application state.
    + Take an action.
    + Make an assertion about the resulting application state.

\------------------------
---------------------------

tips 
------

mocha
^^^^^^

+ ``describe`` = test-suites / group of tests
+ ``context`` = alias of ``describe``

+ ``it()`` = tests
+ Pre-conditions: test, assertions ex vs actual, post steps
+ .skip() = it.skip - to skip the test case
+ .only() = it.only() = runs specific test case 

+ before() = run once before all the test blocks
+ after() = runs once after all the test blocks

+ beforeEach() = runs once before each test block
+ afterEach() = runs once after each test block

html
^^^^^^
+ **IMP**: anything that is written in HTML tags has attribute as ``data-*`` has no meaning, the browsers would ignore this
+ e.g. ``<img data-test="abc" />``