/// <reference types="cypress" />

import chalk from 'chalk';

describe('test_block', () => {

    it('test one', () => { })
    it.skip('test two', () => { throw new Error('oops..') })
    it('test two', () => { cy.visit('https://codedamn.com') })

    console.log(chalk.blue('Hello world!'));
})