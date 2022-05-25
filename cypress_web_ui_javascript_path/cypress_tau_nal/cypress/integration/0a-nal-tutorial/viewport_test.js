describe('testing diff view ports', () => {

    before(() => {
        console.log('inside before()...')
    })

    beforeEach(() => {
        console.log("inside beforeEach()...");
        cy.visit('http://www.google.com/');
    })

    it('open in macbook-13', () => {
        cy.viewport('macbook-13');
        cy.screenshot();
        cy.wait(200);
    })

    it('open in iphone-x', () => {
        cy.viewport('iphone-x');
        cy.screenshot();
        cy.wait(200);
    })

    it('open in 550 x 750', () => {
        cy.viewport(550, 750);
        cy.screenshot();
        cy.wait(200);
    })

})