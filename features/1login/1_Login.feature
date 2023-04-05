Feature: 1_Login.feature

@TC01
Scenario: Login into Salesforce with valid username and clear password field
Given user is on "Loginpage"
When user  enter into Textbox "Username" "shekinah@tek.com"
Then user  enter into Textbox "Password" " "
And click on button "Login"
Then error message is displayed and user validates the error message "Errormessage" 

@TC02
Scenario: Login into Salesforce with valid username and valid password
Given user is on "Loginpage"
When user  enter into Textbox "Username" "shekinah@tek.com"
Then user  enter into Textbox "Password" "Jerieljamon230784"
And click on button "Login"
And validate title "Title" "Home Page ~ Salesforce - Developer Edition"

@TC03
Scenario: Login into Salesforce with valid username and valid password with rememberme checked
Given user is on "Loginpage"
When user  enter into Textbox "Username" "shekinah@tek.com"
Then user  enter into Textbox "Password" "Jerieljamon230784"
Then click on checkbox "RememberMe"
And click on button "Login"
Given user is on "Homepage"
Then click on usermenu "usermenudd"
And click on Logout "Logout"
Then validate the populated usermenu Textbox "popusername" "shekinah@tek.com"