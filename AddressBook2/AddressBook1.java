package AddressBook2;


import java.util.*;

public class AddressBook1 {
    static Collection<Contact1> person = new ArrayList<>();
   // Dictionary address = new Hashtable();

    public void console() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------");
            System.out.println("Select");
            System.out.println("1. Create Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createContacts();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    toDelete();
                    break;
                case 4:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("Enter valid Option");
            }
        }
    }

    // to create contacts of User
    public void createContacts() {
        Contact1 contacts = new Contact1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        contacts.setLastName(lastName);

        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        contacts.setAddress(address);

        System.out.println("Enter City: ");
        String city = sc.nextLine();
        contacts.setCity(city);

        System.out.println("Enter State: ");
        String state = sc.nextLine();
        contacts.setState(state);

        System.out.println("Enter Zip: ");
        String zip = sc.nextLine();
        contacts.setZip(zip);

        System.out.println("Enter phoneNumber:");
        String phoneNumber = sc.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email Id: ");
        String email = sc.nextLine();
        contacts.setEmail(email);

        person.add(contacts);
        System.out.println("Contact Of" + firstName + "created successfully");

    }

    // to edit contacts in AddressBook
    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name you want to edit: ");
        String first = sc.next();
        boolean isPerson = false;

        for (int i = 0; i < person.size(); i++) {
            if (((ArrayList<Contact1>) person).get(i).getFirstName().equals(first)) {
                isPerson = true;
                ((ArrayList<Contact1>) person).get(i).setFirstName(first);

                System.out.print("Enter Last Name:");
                String lastName = sc.next();
                ((ArrayList<Contact1>) person).get(i).setLastName(lastName);

                System.out.print("Enter Address:");
                String address = sc.next();
                ((ArrayList<Contact1>) person).get(i).setAddress(address);

                System.out.print("Enter state:");
                String state = sc.next();
                ((ArrayList<Contact1>) person).get(i).setState(state);

                System.out.print("Enter zip:");
                String zip = sc.next();
                ((ArrayList<Contact1>) person).get(i).setZip(zip);

                System.out.print("Enter phoneNumber:");
                String phoneNumber = sc.next();
                ((ArrayList<Contact1>) person).get(i).setPhoneNumber(phoneNumber);

                System.out.print("Enter email:");
                String email = sc.next();
                ((ArrayList<Contact1>) person).get(i).setEmail(email);

                System.out.println("Contact edited sucessfully");
            }
        }
        if (!isPerson)
            System.out.println("Contact could not be found");
    }

    // to delete record of User
    public void toDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the contact to be deleted");
        String firstName = sc.next();

        for (int i = 0; i < person.size(); i++) {
            if (((ArrayList<Contact1>) person).get(i).getFirstName().equals(firstName)) {
                person.remove(((ArrayList<Contact1>) person).get(i));
                System.out.println("Contact removed successfully");
            } else {
                System.out.println("Contact not found");
            }
        }
    }
}
