package addressbook;

public class AddressEntry {
	private String firstName;
	private String lastName;
	private String phoneNumber; //not sure if long is the best way to hold data
	private String email;
	
	public AddressEntry() {
		
	}
	
	public AddressEntry(String firstName, String lastName, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	//Generated getters and setters
	
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		//methods
		public boolean checkPhoneNumber(String phoneNumInput) {
			if (phoneNumInput.length() != 10) {
				System.out.println("\n Phone Number not in correct format! Must be in 10 digit format without parenthesis or dashes! ie XXXXXXXXXX \n");
				return false;
			}
			return true;
		}
		
		public boolean checkEmail(String emailInput) {
			
			if(emailInput.indexOf('@') == -1) {
				System.out.println("\n Email is not in the correct format! Must contain \"@\" \n");
				return false;
			}
			return true;
		}
		
		
		public void printAddressEntry() {
			System.out.println("*********************************");
			System.out.println("First Name: "+ this.firstName);
			System.out.println("Last Name: "+ this.lastName);
			System.out.println("Phone Number: "+ this.phoneNumber);
			System.out.println("Email Address: "+ this.email);
			System.out.println("*********************************\n");
		}

		//Generated toString function to make sure input data is in the correct format
		@Override
		public String toString() {
			return "addressEntry [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
					+ phoneNumber + ", email=" + email + "]";
		}
}
