/// <reference types="cypress" />

let imgOptions = { updateImages: false, maxDiffThreshold: 0.0000000001 };
describe( 'google page visual diff', () => {

  beforeEach( () => {
    cy.visit( 'https://example.cypress.io/todo' );
    cy.wait( 2000 );
  } )

  it( 'test #1', () => {
    cy.log( 'visual diff home page' );
    cy.matchImage( imgOptions )
  } );

  it( 'test #2', () => {
    cy.log( 'visual diff navbar' );
    cy.get( '#navbar' ).matchImage( imgOptions )
  } )

} );
