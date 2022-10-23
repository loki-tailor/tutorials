// typescript / ES6
import { initPlugin } from '@frsource/cypress-plugin-visual-regression-diff/dist/plugins';
import { defineConfig } from 'cypress';

export default defineConfig( {
  // initPlugin must be called in the section where it is used: e2e or component
  e2e: {
    setupNodeEvents ( on, config ) {
      initPlugin( on, config );
    }
  }
} );
