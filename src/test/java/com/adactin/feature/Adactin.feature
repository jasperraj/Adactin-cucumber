Feature: Testing Adactin Application end to end process

Scenario: Verify that user is able to login the application

Given User launch the application

When user enters the valid username in the username field
And user enters the password in the password field
And user is able to check the login button
Then User verify the homepage lands on or navigate to search hotel

Scenario: Verify that user is able to enter details in SEARCH HOTELS

When user selects the location
And user selects the hotel
And user selects the room type
And user selects the no. of rooms
And user enter the check in date
And user enter the check out date
And user selects the adults per room
And user selects the children per room
And user click on search button
Then user verify search hotel page lands on to select hotel

Scenario: Verify user able to  SELECT HOTELS

When user select hotel radio button
And user click on continue button
Then user verify select hotel page navigate to  book a hotel

Scenario: Verify user able to BOOK A HOTEL

When user enter the first name 
And user enter the last name  
And user enter the billing address
And user enter the Credit card no.
And user selects Credit Card type
And user selects expiry date-month
And user selects expiry date-year
And user enters the CVV no.
And user clicks on Book now button
Then user verify book a hotel page navigate to booking confirmation

Scenario: Verify user able to view a hotel BOOKING CONFIRMATION 

 When user click on My Itinerary button
 Then user verify hotel booking confirmation navigate to booked itinerary 
 
 Scenario: Verify user able to cancel booked hotel
 
When user select the booked room (check box)
And user clicks cancel selected
And user clicks the confirm cancel selected ok button
Then user verify the cancel selected as before










