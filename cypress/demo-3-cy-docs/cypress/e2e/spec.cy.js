// / <reference types="Cypress" />

describe('My First Test', () => {
  it('Visits the Kitchen Sink', () => {


    // cy.pause();

    // -------------------- step #1: application state --------------------
    cy.visit('https://example.cypress.io')

    // -------------------- step #2: action --------------------
    cy.contains('type').click()

    // -------------------- step #3: assertion --------------------
    // Should be on a new URL which
    // includes '/commands/actions'
    cy.url().should('include', '/commands/actions')

    // Get an input, type into it and verify
    // that the value has been updated
    // -------------------- s2, s3 --------------------
    cy.get('.action-email')
      .type('fake@email.com')
      .should('have.value', 'fake@email.com')

  })
})