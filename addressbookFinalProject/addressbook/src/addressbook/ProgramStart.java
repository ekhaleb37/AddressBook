package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		//ArrayList<AddressEntry> addressBook = new ArrayList<>();
		
		//Create a do while loop
		boolean programRunning = true;
		AddressBook updateBook = new AddressBook();
		System.out.println("What Would you like to do with the Address Book? \n");
		
		do {
			System.out.println("1) Add an entry \n");
			System.out.println("2) Remove an entry \n");
			System.out.println("3)  Search for a specific entry \n");
			System.out.println("4)  Print Address Book \n"); //add an iterator to print everything
			System.out.println("5) Delete Book \n");
			System.out.println("6) Quit \n");
			
			String value = input.nextLine();
			int choice = Integer.parseInt(value);//could add input.nextInt without reading to a variable
			
			if (choice < 1 || choice > 6) { //should catch any inputs not recognized
				System.out.print("Please enter a valid input between 1 and 6! \n");
			}
			
			if (choice == 1) {
				//Add an entry to addressEntries
				System.out.println("Enter First Name: ");
				String firstName = input.nextLine();
				
				System.out.println("Enter Last Name: ");
				String lastName = input.nextLine();
				
				System.out.println("Enter Phone Number: ");
				String phoneNum = input.nextLine();
				
				System.out.println("Enter Email Address: ");
				String email = input.nextLine();
				
				AddressEntry newEntry = new AddressEntry(firstName, lastName, phoneNum, email);
				boolean checkNewEmail = newEntry.checkEmail(email);
				boolean checkNewPhone = newEntry.checkPhoneNumber(phoneNum);
				if (checkNewEmail && checkNewPhone) {
					updateBook.addEntry(newEntry);
					System.out.println("Please choose what you's like to do with the database: \n");
				}				 
				
				
			}
			if (choice == 2) {
				System.out.println("Enter the entry's email to remove: \n");
				String entryToBeRemoved = input.nextLine();
				updateBook.deleteEntry(entryToBeRemoved);
				
				System.out.println("Please choose what you's like to do with the database: \n");
			}
			
			if (choice == 3) {
				System.out.println("Enter your search: \n");
				String searchInput = input.nextLine();
				updateBook.searchEntry(searchInput);
				
				System.out.println("Please choose what you's like to do with the database: \n");
			}
			
			if (choice == 4) {
				updateBook.printAddressBook();
				
				System.out.println("Please choose what you's like to do with the database: \n");
			}
			
			if (choice == 5) {
				updateBook.deleteAddressBook();
				
				System.out.println("Please choose what you's like to do with the database: \n");
			}
			
			if (choice == 6) {
				System.out.println("Exited out of Program \n");
				programRunning = false;
			}
			
		} while(programRunning);
	}

}
