Feature: duckduckgo.com

	@visual
	Scenario: visiting the frontpage
		When I visit duckduckgo.com
		# Then I should see a search bar
		Then I perform visual test
