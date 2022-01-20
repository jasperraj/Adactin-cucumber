package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.LoginPage;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	LoginPage lp=new LoginPage(driver);
	
	@Given("^User launch the application$")
	public void user_launch_the_application() {
		getUrl("https://adactinhotelapp.com/");
	        
	}

	@When("^user enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field()  {
	    inPut(lp.getUsername(), "dukeduke");
	    
	}

	@When("^user enters the password in the password field$")
	public void user_enters_the_password_in_the_password_field()  {
	    
	    
	}

	@When("^user is able to check the login button$")
	public void user_is_able_to_check_the_login_button()  {
	    
	    
	}

	@Then("^User verify the homepage lands on or navigate to search hotel$")
	public void user_verify_the_homepage_lands_on_or_navigate_to_search_hotel()  {
	    
	    
	}
	
	@When("^user selects the location$")
	public void user_selects_the_location(){
	   
	    
	}

	@When("^user selects the hotel$")
	public void user_selects_the_hotel(){
	   
	    
	}

	@When("^user selects the room type$")
	public void user_selects_the_room_type(){
	   
	    
	}

	@When("^user selects the no\\. of rooms$")
	public void user_selects_the_no_of_rooms(){
	   
	    
	}

	@When("^user enter the check in date$")
	public void user_enter_the_check_in_date(){
	   
	    
	}

	@When("^user enter the check out date$")
	public void user_enter_the_check_out_date(){
	   
	    
	}

	@When("^user selects the adults per room$")
	public void user_selects_the_adults_per_room(){
	   
	    
	}

	@When("^user selects the children per room$")
	public void user_selects_the_children_per_room(){
	   
	    
	}

	@When("^user click on search button$")
	public void user_click_on_search_button(){
	   
	    
	}

	@Then("^user verify search hotel page lands on to select hotel$")
	public void user_verify_search_hotel_page_lands_on_to_select_hotel(){
	   
	    
	}

	@When("^user select hotel radio button$")
	public void user_select_hotel_radio_button(){
	   
	    
	}

	@When("^user click on continue button$")
	public void user_click_on_continue_button(){
	   
	    
	}

	@Then("^user verify select hotel page navigate to  book a hotel$")
	public void user_verify_select_hotel_page_navigate_to_book_a_hotel(){
	   
	    
	}

	@When("^user enter the first name$")
	public void user_enter_the_first_name(){
	   
	    
	}

	@When("^user enter the last name$")
	public void user_enter_the_last_name(){
	   
	    
	}

	@When("^user enter the billing address$")
	public void user_enter_the_billing_address(){
	   
	    
	}

	@When("^user enter the Credit card no\\.$")
	public void user_enter_the_Credit_card_no(){
	   
	    
	}

	@When("^user selects Credit Card type$")
	public void user_selects_Credit_Card_type(){
	   
	    
	}

	@When("^user selects expiry date-month$")
	public void user_selects_expiry_date_month(){
	   
	    
	}

	@When("^user selects expiry date-year$")
	public void user_selects_expiry_date_year(){
	   
	    
	}

	@When("^user enters the CVV no\\.$")
	public void user_enters_the_CVV_no(){
	   
	    
	}

	@When("^user clicks on Book now button$")
	public void user_clicks_on_Book_now_button(){
	   
	    
	}

	@Then("^user verify book a hotel page navigate to booking confirmation$")
	public void user_verify_book_a_hotel_page_navigate_to_booking_confirmation(){
	   
	    
	}

	@When("^user click on My Itinerary button$")
	public void user_click_on_My_Itinerary_button(){
	   
	    
	}

	@Then("^user verify hotel booking confirmation navigate to booked itinerary$")
	public void user_verify_hotel_booking_confirmation_navigate_to_booked_itinerary(){
	   
	    
	}

	@When("^user select the booked room \\(check box\\)$")
	public void user_select_the_booked_room_check_box(){
	   
	    
	}

	@When("^user clicks cancel selected$")
	public void user_clicks_cancel_selected(){
	   
	    
	}

	@When("^user clicks the confirm cancel selected ok button$")
	public void user_clicks_the_confirm_cancel_selected_ok_button(){
	   
	    
	}

	@Then("^user verify the cancel selected as before$")
	public void user_verify_the_cancel_selected_as_before(){
	   
	    
	}
	
	
	
}
