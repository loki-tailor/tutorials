/// <reference types="Cypress" />
// <reference types="chai" />

describe('hub spot page feature', () => {
    it('handle hub spot login test', () => {
        cy.visit('https://app.hubspot.com/login', { failOnStatusCode: false });
        cy.contains("Checking").should("be.visible");
        // cy.get('#username', { timeout: 60000 }).type('loki@gmail.com');
        // cy.get('#password').type('loki@123');
        // cy.get('#loginBtn').click();
    })
})