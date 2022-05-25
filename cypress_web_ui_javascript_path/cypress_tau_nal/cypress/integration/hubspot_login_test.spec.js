/// <reference types="Cypress" />
// <reference types="chai" />

describe("application exception handling", () => {
  it("hub spot app login", () => {
    cy.visit("https://app.hubspot.com/", { failOnStatusCode: false });
    cy.contains("Checking").should("be.visible");
    // cy.get("#username").type("loki@gmail.com");
    // cy.get("#password").type("loki@123");
    // cy.get("#loginBtn").click();
  });
});
