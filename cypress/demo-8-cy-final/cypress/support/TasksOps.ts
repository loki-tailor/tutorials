import createBundler from '@bahmutov/cypress-esbuild-preprocessor';
import createEsbuildPlugin from '@badeball/cypress-cucumber-preprocessor/esbuild';
import fs from 'fs';

// ##########################################################s
export const taskReadFileMaybe = {
	readFileMaybe(fileName: string) {
		if (fs.existsSync(fileName)) {
			return fs.readFileSync(fileName, 'utf-8');
		}
		return null;
	},
};

// ##########################################################
export const taskLog = {
	log(msg: any) {
		// THIS WILL ONLY PRINT { TASK + ARG } in Cypress Test Runner
		console.log(`[task @ log] ${msg}`);
		return null;
	},
};
