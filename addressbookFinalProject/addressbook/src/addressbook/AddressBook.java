package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public ArrayList<AddressEntry> addressBook = new ArrayList<>();
	
	
	
	//Methods
	public void addEntry(AddressEntry addressEntry) { 
		addressBook.add(addressEntry);
		System.out.println("Entry added! \n");
		}
	
	
	
	public void deleteEntry(String emailToBeDeleted) {
		String deleteSearch = emailToBeDeleted;
		boolean isEmailValid = false;
		Scanner input = new Scanner(System.in);
		
		
		for (AddressEntry i:addressBook) {
			if (i.getEmail().contains(deleteSearch)) {
				isEmailValid = true;
				i.printAddressEntry();
				
				System.out.println("Are you sure you would like to delete this entry? Enter \"yes\" to confirm, anything else will return you to the menu! \n");
				String userConfirm = input.nextLine();
				userConfirm.toLowerCase();
				if (userConfirm.equals("yes")) {
					addressBook.remove(i);
					System.out.println("Deleted the following entry: " + emailToBeDeleted + " \n");
				} else {
					System.out.println("Entry not deleted returning to menu! \n");
				}
				
				break;
			}
		}
		
		if (!isEmailValid) {
			System.out.println("Email does not exist! \n");
		}
//		for (int i = 0; i < addressBook.size(); i++) {
//			addressBook.get(i);
//			if (addressBook.getEmail() .equals(deleteSearch)) {
//				addressBook.remove();
//				break;
//			}
//		}
		
		//Needs to catch non valid searches
	}
	
	public void searchEntry(String searchInput) {
		String search = searchInput; //Unnecessary
		boolean isSearchValid = false;
		
		for (AddressEntry i:addressBook) {
			if (i.getFirstName().contains(search)) {
				i.printAddressEntry();
				isSearchValid = true;
				continue;
			}
			
			if (i.getLastName().contains(search)) {
				i.printAddressEntry();
				isSearchValid = true;
				continue;
			}
			
			if (i.getPhoneNumber().contains(search)) {
				i.printAddressEntry();
				isSearchValid = true;
				continue;
			}
			
			if (i.getEmail().contains(search)) {
				i.printAddressEntry();
				isSearchValid = true;
				continue;
				
			}
		}
		if (isSearchValid) {
			System.out.println("Search has finished! \n");
		} else {
			System.out.println("No results found! \n");
		}
		
	}
	
	public void printAddressBook() {
		if (addressBook.isEmpty()) {
			System.out.println("Address Book is empty \n");
		}
		for(AddressEntry i:addressBook) {
			i.printAddressEntry();				
		}
	}
	
	public void deleteAddressBook() {
		addressBook.clear(); //Removes all elements from list
		System.out.println("Address book cleared! \n");
		
	}
}

