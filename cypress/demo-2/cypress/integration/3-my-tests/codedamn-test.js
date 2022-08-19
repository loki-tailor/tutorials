/// <reference types="cypress" />

describe('basic authenticated tests with login', () => {

    beforeEach(() => {
        cy.viewport('macbook-11')
        cy.visit('https://codedamn.com')
    })

    it('should load playground correctly', () => {

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        // login
        cy.contains('Unable to authorize').should('not.exist')
        cy.get('[data-testid=username]').type('devloki', { force: true })
        cy.get('[data-testid=password]').type('devloki@123', { force: true })
        cy.get('[data-testid=login]').click({ force: true })
        cy.contains('Unable to authorize').should('not.exist')
        cy.url().should('include', '/dashboard', { pageLoadTimeout: 5000 })

        // directly visit the playgroun
        cy.visit('https://codedamn.com/playground/Wlb8bFYI1SwMFLucuHipf')

        // verify playground initializing
        // cy.contains('GETTING YOUR AUTH TOKENS').should('exist')
        // cy.contains('Setting up workspace').should('exist')
        cy.get('.animate-spin').should('exist')
        cy.get("div[class='flex items-center justify-center']").should('exist')

        cy.get("div[class='flex items-center justify-center']", { timeout: 6 * 1000 }).should('not.exist')
        cy.get('.animate-spin').should('not.exist')
        cy.log('playground successfully loaded !!!!!!!')

        // cy.debug() // dev tools should be open
        // cy.pause()


    })

    it.skip('creating a new file in playground', () => {

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        // login
        cy.contains('Unable to authorize').should('not.exist')
        cy.get('[data-testid=username]').type('devloki', { force: true })
        cy.get('[data-testid=password]').type('devloki@123', { force: true })
        cy.get('[data-testid=login]').click({ force: true })
        cy.contains('Unable to authorize').should('not.exist')
        cy.url({ timeout: 6000 }).should('include', '/dashboard')

        // directly visit the playgroun
        cy.visit('https://codedamn.com/playground/Wlb8bFYI1SwMFLucuHipf')

        // verify playground initializing
        cy.get("div[class='flex items-center justify-center']", { timeout: 6 * 1000 }).should('not.exist')
        cy.get('.animate-spin').should('not.exist')
        cy.log('playground successfully loaded !!!!!!!')

        // wait for server to get up completely
        // cy.wait(6 * 1000)

        // do CTRL + C to quit the running server
        // create a new file
        const fileName = Math.random()

        let fileCreate = `touch demo.${fileName}.js{enter}`
        console.log('creating file with name: ', fileName)

        // [data-testid="xterm"] .xterm-helper-textarea
        cy.get('#terminal1 [aria-label="Terminal input"]', { timeout: 10 * 1000 })
            .type('{ctrl}{c}', { force: true })
            .type(fileCreate)

        // verify that file is created
        cy.contains(`demo.${fileName}.js`).should('exist')

        // cy.debug() // dev tools should be open
        // cy.pause()
    })

    it.skip('renaiming a file', () => {

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        // login
        cy.contains('Unable to authorize').should('not.exist')
        cy.get('[data-testid=username]').type('devloki', { force: true })
        cy.get('[data-testid=password]').type('devloki@123', { force: true })
        cy.get('[data-testid=login]').click({ force: true })
        cy.contains('Unable to authorize').should('not.exist')
        cy.url({ timeout: 6000 }).should('include', '/dashboard')

        // directly visit the playgroun
        cy.visit('https://codedamn.com/playground/Wlb8bFYI1SwMFLucuHipf')

        // verify playground initializing
        cy.get("div[class='flex items-center justify-center']", { timeout: 6 * 1000 }).should('not.exist')
        cy.get('.animate-spin').should('not.exist')
        cy.log('playground successfully loaded !!!!!!!')

        // create a new file
        const fileName = Math.random()
        console.log('creating file with name: ', fileName)

        // verify that server is up and basic HTML page is loaded
        cy.contains('Welcome to codedamn', { timeout: 12 * 1000 })

        // [data-testid="xterm"] .xterm-helper-textarea
        cy.get('#terminal1 [aria-label="Terminal input"]')
            .type('{ctrl}{c}', { force: true })
            .type(`touch demo.${fileName}.js{enter}`)

        // verify that file is created and do right click
        cy.contains(`demo.${fileName}.js`).should('exist').rightclick()

        cy.contains('Rename File').click()

        cy.get(`[data-testid="exp_demo.${fileName}.js"]`).should('exist').type('{home}new_{enter}')

        cy.get(`[data-testid="exp_demo.${fileName}.js"]`).should('not.exist')

        cy.get(`[data-testid="exp_new_demo.${fileName}.js"]`).should('exist')

        // cy.debug() // dev tools should be open
        // cy.pause()
    })
})

describe.skip('basic authenticated test', () => {

    before(() => {
        // TODO: set this as localStorage token for authehtication
        const token = ''

        cy.then(() => {
            window.localStorage.setItem('__auth__token', token)
        })
    })

    beforeEach(() => {
        cy.viewport('macbook-11')
        cy.visit('https://codedamn.com')
    })

    it.skip('url details', () => {
        // recommeded, the then most likely waits for promise to finish
        cy.url().then(value => {
            cy.log('The current URL is: ', value)
            console.log('The current URL is: ', value)
        })

        // NOT RECOMMENDED
        cy.log('The current URL is: ', cy.url())

        // logging
        console.log('i am logged in chrome dev tools console area...')

    })

})

describe.skip('basic unauthenticated test', () => {

    beforeEach(() => {
        cy.viewport('macbook-11')
        cy.visit('https://codedamn.com')
    })

    it.skip('login should display correct error', () => {

        // TODO: set this as localStorage token for authehtication
        const token = '"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImRldmxva2kiLCJfaWQiOiI2MjZlZTc4YjRmYjJhODAwMDk5YTJiMzkiLCJuYW1lIjoiZGV2bG9raSIsImlhdCI6MTY1MTQzNTc0MywiZXhwIjoxNjU2NjE5NzQzfQ.VqAGaqHCNgmsOv9rR37M3I-Beqm04pNQDCUb2EUVY-c"'

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        cy.contains('Unable to authorize').should('not.exist')
        cy.get('[data-testid=username]').type('devloki', { force: true })
        cy.get('[data-testid=password]').type('', { force: true })
        cy.get('[data-testid=login]').click({ force: true })
        cy.contains('Unable to authorize').should('not.exist')
        cy.url().should('include', '/dashboard')


    })

    it.skip('login should display correct error', () => {

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        cy.contains('Unable to authorize').should('not.exist')
        cy.get('[data-testid=username]').type('admin', { force: true })
        cy.get('[data-testid=password]').type('admin', { force: true })
        cy.get('[data-testid=login]').click({ force: true })
        cy.contains('Unable to authorize').should('exist')


    })

    it.skip('printing values', () => {

        // visit home papge > click login > check if login page opened
        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        // recommeded, the then most likely waits for promise to finish
        cy.url().then(value => {
            cy.log('The current URL is: ', value)
            console.log('The current URL is: ', value)
        })

        // NOT RECOMMENDED
        cy.log('The current URL is: ', cy.url())

        // logging
        console.log('i am logged in chrome dev tools console area...')


    })

    it.skip('check if all URLs are working', () => {

        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')

        cy.contains('Forgot your password?').click({ force: true })
        cy.url().should('include', '/password-reset')
        cy.go('back')

        cy.contains("Create one").click()
        cy.url().should('include', '/register')
        cy.go('back')

    })

    it.skip('login page looks good', () => {

        cy.contains('Sign in').click();
        cy.contains('Sign in to').should('exist')
        cy.contains('Sign in with Google').should('exist')
        cy.contains('Sign in with GitHub').should('exist')
        cy.contains('Forgot your password?').should('exist')
        cy.contains("Don't have an account? ").should('exist')
        cy.contains("Create one").should('exist')
    })

    it.skip('we have correct page title', () => {

        cy.viewport('iphone-se2')

        cy.contains('Build projects, practice and learn to code from scratch - without leaving your browser.').should('exist')

        cy.get('div#layout-conntainer').should('exist')
        cy.get('div[id=layout-conntainer]').should('exist')

        // Way 1 (recommended)
        cy.get("[data-testid='homepage-cta']").should('exist')

        // Way 2 (not recommended: html path may change)
        cy.get('div#layout-conntainer > section > div > a').should('exist')

        // Way 3 (we might change the text)
        cy.contains('Explore All Learning Paths').should('exist')

        cy.get('[data-bypassmenuclose="true"]').click()

    })

})