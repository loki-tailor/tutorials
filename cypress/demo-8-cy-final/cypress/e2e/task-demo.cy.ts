/// <reference types="cypress" />

describe('testing various tasks only', () => {
	it('task @ log', () => {
		cy.task('log', { msg: 'message for task from test ... @ [console and only taskName + Args in Cy Test Runner' });
		console.log('message for console.log() from test ... @ [only for DevTools area]');
		cy.log('message for cy.log() from test ... @ [only for Cy Test Runner]');
	});

	it('task @ multi-args', () => {
		cy.task('hello', { greetings: 'Hello', name: 'loki' }, { log: true });
	});

	it('task @ readFileMaybe', () => {
		cy.task('readFileMaybe', 'packae.json').then((txtOrNull) => {
			console.log(txtOrNull);
		});
	});

	it('task @ countFolders/Files in a dir', () => {
		cy.task('countFiles', 'cypress/e2e').then((count) => {
			cy.log(`count = ${count}`);
		});
	});
});
