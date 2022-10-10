// / <reference types="Cypress" />

describe("printing env variables", () => {

    it("env print: #1: Cypress.env()", () => {
        return cy.log(Cypress.env())
    })
})