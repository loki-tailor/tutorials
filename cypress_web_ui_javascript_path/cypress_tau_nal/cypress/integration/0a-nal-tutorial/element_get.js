/// <reference types="Cypress" />
describe("check element get concept", () => {
  it("element  get testing", () => {
    cy.visit("https://www.freshworks.com/");

    cy.contains("Platform").click();

    cy.contains("Freddy").click();

    cy.url().should("include", "/freddy-ai");

    cy.get("div.l-page > h2.align-center")
      .should("be.visible")
      .and("contain", "Freddy AI")
      .and("have.length", 1);
    ;
  });
});
