package Mobile;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Contacts  {
     ArrayList<String> ContactName = new ArrayList<>();
    ArrayList<Long> PhoneNumber = new ArrayList<>();

     public  void addContact(){
         System.out.print("Enter Name: ");
         Scanner s = new Scanner(System.in);
         String cname = s.nextLine();
         System.out.print("Enter Phone Number: ");
         long pno = s.nextLong() ;
         ContactName.add(cname);
         PhoneNumber.add(pno);
         System.out.println("new Contact is Added");
     }

     public void updateContact(){
         System.out.print("Enter Position: ");
         Scanner sc = new Scanner(System.in);
         int position = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Contact Name: ");
         String Value = sc.nextLine();
         System.out.print("Enter Phone Number: ");
         long pno = sc.nextLong();
         ContactName.set(position-1,Value);
         PhoneNumber.set(position-1,pno);
         System.out.println("Your Contact is Updated");
     }

      public  void removeContact(){
         System.out.print("Enter the Contact name to remove: ");
         Scanner s = new Scanner(System.in);
         String name = s.nextLine();
         int position = ContactName.indexOf(name);
         if(position>=0){
         ContactName.remove(position);
         PhoneNumber.remove(position);
         System.out.println("Successfully Contact is Removed");}
         else System.out.println("contact Not found");
      }
      public void searchContact(){
          System.out.print("Enter the Contact name to search: ");
          Scanner sc = new Scanner(System.in);
          String name = sc.nextLine();
          int position = ContactName.indexOf(name);
          if(position>=0){
              System.out.println("Contact Found");
          }
          else System.out.println("Contact not Found");
      }
      public void fetchContacts(){
         for(int i =0;i < ContactName.size();i++){
             System.out.println(i+". "+ContactName.get(i));
             System.out.println("   "+PhoneNumber.get(i));

         }
      }


}
