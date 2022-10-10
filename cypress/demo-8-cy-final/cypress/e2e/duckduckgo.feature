Feature: duckduckgo.com

	@foo
	Scenario: visiting the frontpage
		Given a table step
			| Cucumber     | Cucumis sativus |
			| Burr Gherkin | Cucumis anguria |
		When I am a step-1
		Then I call nested step
		When I visit duckduckgo.com
		Then I should see a search bar
