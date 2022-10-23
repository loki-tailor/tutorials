import { defineConfig } from "cypress";

const getCompareSnapshotsPlugin = require('cypress-image-diff-js/dist/plugin');



export default defineConfig({
  e2e: {
    setupNodeEvents (on, config) {
      // implement node event listeners here
      getCompareSnapshotsPlugin(on, config);

    },

  },
});
