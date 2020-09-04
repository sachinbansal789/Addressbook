import java.io.*;
import java.util.*;

public class AddressBook{

    private Contact[] names; 
    private int numOfContact;

    public AddressBook() {
                names = new Contact[10];
                numOfContact = 0;
    }

    public void addcontact(Contact c) {
                names[numOfContact] = c;
                numOfContact++;
    }

    public void printcontacts() {
                for (int i=0;i<numOfContact;i++)
                names[i].printcontact();
    }

    public int contactsCount() {
                return numOfContact;
    }

    private int havecontact(String fn, String ln) {

                for (int i=0;i<numOfContact;i++)
                if (names[i].getfName().equals(fn) && names[i].getlName().equals(ln))
                                return i;
                return -1;
    }

    public void deletecontact(String fn, String ln) {

                int place = havecontact(fn,ln);
                if (place >= 0) {
                names[place] = names[numOfContact-1];
                numOfContact--;
                System.out.println("Contact Deleted.");
                }
                else
                        System.out.println("Contact Not Present.");
    }
    
    public static void menu() {
                System.out.println("1.Add a new contact to your address book.");
                System.out.println("2.Delete a contact from your address book.");
                System.out.println("3.Print out the number of contacts you have.");
                System.out.println("4.Print out information of all of your contacts.");
                System.out.println("5.Quit.");
                System.out.println("Enter your menu choice:");
    }



    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                AddressBook cont = new AddressBook();

                menu();
     
                int choice = sc.nextInt();


                while (choice!=5) {

                
                if (choice == 1) {

                                if (cont.contactsCount() < 10) {

                           
                                System.out.print("Enter First name: ");
                                String fname = sc.next();
                                System.out.print("Enter Last name: ");
                                String lname = sc.next();
                                sc.nextLine();
                                System.out.print("Enter Address: ");
                                String add = sc.nextLine();
                                System.out.print("Enter City name: ");
                                String city = sc.next();
                                System.out.print("Enter State name: ");
                                String state = sc.next();
                                System.out.print("Enter Phone number: ");
                                long pnumber = sc.nextLong();
                                System.out.print("Enter Zip Code: ");
                                long zip = sc.nextLong();

                                cont.addcontact(new Contact(fname,lname,add,city,state,pnumber,zip));
                                }
                                else
                                System.out.println("Sorry, can not add anyone, your AddressBook is full.");
                }

                 else if (choice == 2) {
                                System.out.println("What is the first name of the contact you want to delete?");
                                String fname = sc.next();
                                System.out.println("What is the last name of the contact you want to delete?");
                                String lname = sc.next();
                                cont.deletecontact(fname, lname);
                }
                else if (choice == 3) {
                                System.out.println("You have " + cont.contactsCount() + " contacts.");
                }
                else if (choice == 4) {
                                cont.printcontacts();
                }
                
                else if (choice >=5) {
                                System.out.println("Sorry, that was an invalid menu choice, try again.");
                }

                menu();
                choice = sc.nextInt();
                }

    }
}
