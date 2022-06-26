package Mobile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void printInstuct(){
        System.out.println("0 - To print Instructions");
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
        printInstuct();
        Scanner s = new Scanner(System.in);
        while(!exit){
            int n = s.nextInt();
            switch(n){
                case 0: printInstuct();break;
                case 1: contact.addContact(); break;
                case 2: contact.updateContact(); break;
                case 3: contact.removeContact(); break;
                case 4: contact.fetchContacts(); break;
                case 5: contact.searchContact(); break;
                case 6: exit = true; break;
                default :
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}
