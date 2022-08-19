======================
notes
======================

.. topic:: --------------------------------------------------------------------------------------------------------------------------------
    
    --------------------------

pre-requisites
-----------------

.. list-table::
    :align: left

    * - nodejs
    * - angular


dir structure / tips
------------------------

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

mochajs tips
------------------
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

html tips
---------------
+ **IMP**: anything that is written in HTML tags has attribute as ``data-*`` has no meaning, the browsers would ignore this
+ e.g. ``<img data-test="abc" />``

cypress: CORS / chromeWebSecurity
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


cypress: getting url value
----------------------------------

.. code-block:: typescript

    // recommeded, the then most likely waits for promise to finish
    cy.url().then(value => {
        cy.log('The current URL is: ', value)
        console.log('The current URL is: ', value)
    })

    // NOT RECOMMENDED
    cy.log('The current URL is: ', cy.url())