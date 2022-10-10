TODO-CONCEPTS-PENDING:
- proxy:
  - what is proxy
  - opstech ui proxy
  - cypress proxy settings 
  - ui automation how proxy works
  - what is CORS
  - how to set proxy in angular
- cypress angular
  * @cypress/webpack-preprocessor
  * @cypress/schematic
* cypress:
  * plugins
  * callbacks, observables, async/wait
  * usage of "on().." ?

TAKE LOCAL CONFIGURATIONS FROM:
  - vscode @ user settings .json
  - projs:
    - all cypress recent demos to re-visit
  - LF / CRLF plugin

ts-node --vv
ts-node --vvv
ts-node --showConfig

* ts concepts: import, export, callbacks, definite assignment, optional chaining, OOPs
* template literals
* callback hells, promises, observables
* ts-node @ Skip typechecking, types[] array 


* good to read:
  * cosmiconfig which is used by prettier

* .vscode/launch.json
* .vscode/extensions.json
* .vscode/settings.json
  * editor.codeActionsOnSave: { source.fixAll.eslint: true }
  * editor.formatOnSave: false
  * eslint.validate: [
    "javascript",
    { "language": "typescript", "autoFix": true }
  ]
  * prettier.eslintIntegration: true

* .prettier.json
  * prettier --find-config-path
  * --no-editorconfig

* tsconfig.json
  * https://github.com/tsconfig/bases
  * << compilation + code writing in editor + ts-node + tsc >>
  * preferTsExts (@ts-node)

* package.json:
    - type
    - engine
    - npm start
    - npm build
    - dependencies
        - @types/node
        - @types/lodash
        - tsc-esm
        - rimraf
        - ts-node
        - typescript
