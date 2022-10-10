import { Before, DataTable, Given, Step, Then, When } from '@badeball/cypress-cucumber-preprocessor';

Before(function() {
	// This hook will be executed before all scenarios.
	cy.log('This hook will be executed before all scenarios.');
});

Before({ tags: '@foo' }, function() {
	// This hook will be executed before scenarios tagged with @foo.
	cy.log('This hook will be executed before scenarios tagged with @foo.');
});

Before({ tags: '@foo and @bar' }, function() {
	// This hook will be executed before scenarios tagged with @foo and @bar.
	cy.log('This hook will be executed before scenarios tagged with @foo and @bar.');
});

Before({ tags: '@foo or @bar' }, function() {
	// This hook will be executed before scenarios tagged with @foo or @bar.
	cy.log('This hook will be executed before scenarios tagged with @foo or @bar.');
});

Given(/^a table step$/, (table: DataTable) => {
	const expected = [
		['Cucumber', 'Cucumis sativus'],
		['Burr Gherkin', 'Cucumis anguria'],
	];
	try {
		assert.deepEqual(table.raw(), expected);
		// eslint-disable-next-line @typescript-eslint/no-explicit-any
	} catch (err: any) {
		// ref: https://github.com/chaijs/chai/issues/469
		cy.log(err.actual);
		cy.log(err.expected);
		return;
	}
});

When('I visit duckduckgo.com', () => {
	cy.visit('https://www.duckduckgo.com');
});

Then('I should see a search bar', () => {
	cy.get('#search_form_input_homepage').should('have.attr', 'placeholder', 'Search the web without being tracked');
});

When('a step', () => {
	cy.then(() => {
		return 'pending';
	});
});

When('I am a step-1', () => {
	cy.log('inside step-1');
});

// eslint-disable-next-line prettier/prettier
Then('I call nested step', function(): void {
	Step(this, 'I am a step-1');
});
