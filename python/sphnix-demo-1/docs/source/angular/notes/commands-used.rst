==================
commands used
==================

.. code-block:: bash
    
    # installation
    #1 - node / npm installation @ nodejs.org
    #2 - type script installation ``npm install --location=global typescript``
    #3 - vscode plugin installation:
        # eslint
        # typescript
        # angular
        # npm script
        # Rename Angular Component

.. code-block:: bash

  # checking list of modules installed via npm

  # Bare command
  npm list

  # 'ls' is an alias of list
  npm ls
  
  # Don't show dependencies
  npm list --depth=0
  
  # Global modules
  npm list -g --depth=0
  
  # More info
  npm la
  npm ll
  
  # Show particular environment packages
  npm ls --only=dev
  npm ls --only=prod
  
  # Parseable view (tree view)
  npm ls --parseable=true

.. code-block:: bash

  # checking npm config / cache data
  $ npm cache verify
  $ npm cache ls

  $ npm config ls
  $ npm config ls -l

.. code-block:: bash

  # install @angular/cli
  $ npm install @angular/cli
  $ ng version

  $ ng serve # launch the app locally

.. code-block:: bash

  # creating component
  $ ng g c #folderName
  $ ng g c demo/demo-child
      ...
      CREATE src/app/demo/demo-child/demo-child.component.html (25 bytes)
      CREATE src/app/demo/demo-child/demo-child.component.spec.ts (621 bytes)
      CREATE src/app/demo/demo-child/demo-child.component.ts (291 bytes)
      CREATE src/app/demo/demo-child/demo-child.component.scss (0 bytes)
      UPDATE src/app/app.module.ts (494 bytes)

  # creating a service
  $ ng g s #serviceName
  $ ng g s demo/demo-parent/demo-child
      ...
      CREATE src/app/demo/demo-parent/demo-child.service.spec.ts (373 bytes)      
      CREATE src/app/demo/demo-parent/demo-child.service.ts (138 bytes)
      
.. code-block:: bash
    
  # generating standalone shippable angular framework
  $ ng build --prod --base-href ./