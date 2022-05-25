/// <reference types="cypress" />

describe('test_block', () => {

    it('test one', () => { })
    it.skip('test two', () => { throw new Error('oops..') })
    it('test two', () => { cy.visit('https://codedamn.com') })
})