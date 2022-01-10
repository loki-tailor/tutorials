describe('launch app', () => {

    it('app testing', () => {
        cy.visit('https://www.freshworks.com');
        cy.contains('Platform')
        cy.contains('Platform').click();
        cy.contains('Freddy');
        cy.contains('Freddy').click();
        cy.url().should('include', '/freddy-ai');
    })
})