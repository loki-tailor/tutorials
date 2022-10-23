import { defineConfig } from 'cypress';
import createBundler from '@bahmutov/cypress-esbuild-preprocessor';
import createEsbuildPlugin from '@badeball/cypress-cucumber-preprocessor/esbuild';
import { taskReadFileMaybe, taskLog } from './cypress/support/TasksOps';
import fs from 'fs';

import { initPlugin } from '@frsource/cypress-plugin-visual-regression-diff/dist/plugins';

import { addCucumberPreprocessorPlugin, afterRunHandler } from '@badeball/cypress-cucumber-preprocessor';

// ####################################################################################################################################
export default defineConfig({
	env: {
		FOO: 'bar',
	},
	e2e: {
		specPattern: ['**/*.feature', '**/*.cy.ts'],
		supportFile: false,
		baseUrl: 'https://www.duckduckgo.com',
		setupNodeEvents,
	}, // end @ e2e
}); // end @ defineConfig

// ####################################################################################################################################
async function setupNodeEvents(on: Cypress.PluginEvents, config: Cypress.PluginConfigOptions): Promise<Cypress.PluginConfigOptions> {
	// ----------------------------------------------
	on('file:preprocessor', createBundler({ plugins: [createEsbuildPlugin(config)] }));

	// ----------------------------------------------
	initPlugin(on, config);
	// ----------------------------------------------
	// ref: https://github.com/badeball/cypress-cucumber-preprocessor/issues/805#issuecomment-1218399297
	await addCucumberPreprocessorPlugin(on, config, {
		omitAfterRunHandler: true,
	});

	on('after:run', (results) => {
		console.log('test');
		afterRunHandler(config);
	});

	// ----------------------------------------------
	on('task', taskReadFileMaybe);
	on('task', taskLog);

	// ----------------------------------------------
	on('task', {
		// ####################################
		hello({ greetings, name }) {
			console.log('%s @ %s', greetings, name);
			return null;
		},

		// ####################################
		countFiles(folderName) {
			return new Promise((res, rej) => {
				fs.readdir(folderName, (err, files) => {
					if (err) return rej(err);
					res(files.length);
				});
			});
		},
	}); // end  @ on-task

	// Make sure to return the config object as it might have been modified by the plugin.
	return config;
} // end @ setupNodeEvents
