describe('free crm app', () => {

    it.only('sign-up i.e. checking cross-domain visists', () => {
        cy.visit('https://ui.cogmento.com/');
        cy.title().should('eq', 'Cogmento CRM');
        cy.visit('https://classic.crmpro.com');
        cy.title().should('eq', 'CRMPRO - CRM software for customer relationship management, sales, and support.');
        // chromeWebSecurity: false // adding this will allow both the links to open

    });

    it.skip('login test', () => {
        // test as written in tutorial
        cy.visit('https://classic.crmpro.com');
        cy.title().should('eq', 'CRMPRO - CRM software for customer relationship management, sales, and support.');
        cy.get('input[name="username"').type('batchautomation');
        cy.get('input[name="password"').type('Test@12345');
        cy.get('input[type="submit"').click();
        cy.title().should('includes', 'CRMPRO');
        cy.get('Contacts').click();
    });

    it.only('login & log-out test @ cogmento', () => {
        cy.visit('https://ui.cogmento.com/');
        cy.title().should('eq', 'Cogmento CRM');
        cy.get("[name='email']").type('lmno@outlook.in');
        cy.get("[name='password']").type('Test@123');
        cy.contains('Login').click();
        cy.contains('loki4yu _').should('be.visible');
        cy.get("div[class*='button floating']").click();
        cy.contains('Log Out').click();
        cy.contains('Login').should('be.visible');
    })
});