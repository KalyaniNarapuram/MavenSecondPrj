Feature:
  Scenario Outline:
    Given I am a chrome user
    When I access website <websiteUrl>
    Then I can see <websiteTitle>
    Examples:
    |websiteUrl|websiteTitle|
    |https://www.google.com|Google|
    |https://www.amazon.co.uk|Amazon|