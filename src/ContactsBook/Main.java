package ContactsBook;

import java.util.Scanner;

public class Main {
    public static void printInstruct(){
        System.out.println("0- To print Instructions");
        System.out.println("1- To add a Contact");
        System.out.println("2- To update a Contact");
        System.out.println("3- To remove a Contact");
        System.out.println("4- To print the list of Contacts");
        System.out.println("5- To search a Contact");
        System.out.println("6- TO quit the Application");
    }

    public static void main(String[] args) {
        Contacts contact = new Contacts();

        boolean exit = false;
        printInstruct();
        Scanner s = new Scanner(System.in);
        while(!exit){
            int n = s.nextInt();
            switch (n) {
                case 0 -> printInstruct();
                case 1 -> contact.addContact();
                case 2 -> contact.updateContact();
                case 3 -> contact.removeContact();
                case 4 -> contact.fetchContacts();
                case 5 -> contact.searchContact();
                case 6 -> exit = true;
                default -> System.out.println("invalid choice");
            }
        }
    }
}
