/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contact1;
import java.util.*;
public class Contact1 {
    public static void main(String[] args) {
        LinkedList phonebook = new LinkedList();
            Persons p1 = new Persons();
           
            phonebook.add(p1.Contact1());
            phonebook.add(p1.Contact2());
            phonebook.add(p1.Contact3());
            phonebook.add(p1.Contact4());
            phonebook.add(p1.Contact5());
                   
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
           
            System.out.println("------------------------------------------"
                  + "Address Book System-----------------------------------------");
            String c;
           
           
            do{
                System.out.println("");
                System.out.println("1.Add Contact");
                System.out.println("2.Delete Contact");
                System.out.println("3.Modify/Edit Contact ");
                System.out.println("4.Show All Contacts ");
                 System.out.println("5.Search Contact Information by Name ");
                System.out.println("0.Exit ");
                       
                System.out.print("\nPlease Select any Option: ");
               
                int option = input.nextInt();
                if(option>5){
                    System.out.println("Please enter the number as per the options.");
                    return;
                }
               
                switch(option){
                    case 1:
                        System.out.println("\n--------------------------------------------------"
                                + "Add Contact--------------------------------------------------");
                        phonebook.add(p1.addPerson());
                        System.out.println("-------------------------------------------------------"
                                    +"--------------------------------------------------------");
                    break;

                    case 2:
                        System.out.println("\n--------------------------------------------------"
                                + "Delete Contact-----------------------------------------------");
                        p1 = p1.NametoDelete(phonebook);
                               
                        if(p1!=null){
                            System.out.print("Are you sure? Press 1:(Yes) 0:(No) ");
                            int answer = input.nextInt();                        
                            if(answer ==1){
                                phonebook.remove(p1);
                                System.out.println("Successfully Deleted!");
                                System.out.println("----------------------------------------------------"
                                        + "-------------------------------------------------------------");
                            }
                        }
                        else{
                            System.out.println("\nThis Contact does not exist.");
                            System.out.println("---------------------------------------------------------"
                                  + "------------------------------------------------------------------");
                        }
                        break;

                        case 3:
                            System.out.println("\n----------------------------------------------"
                              + "Modify the PhoneBook---------------------------------------------");
                            p1 = p1.NametoModify(phonebook);
                            if(p1!=null){
                                System.out.print("Are you sure? Press 1:(Yes) 0:(No) ");
                                int answer = input.nextInt();
                                if(answer == 1){
                                    phonebook.remove(p1);
                                    phonebook.add(p1.Modify());
                                    System.out.println("------------------------------------------------"
                                     + "--------------------------------------------------------");
                                }
                            }
                            else{
                                System.out.println("\nThis Contact does not exist.");
                                System.out.println("----------------------------------------------------"
                                     + "-----------------------------------------------------------");
                            }
                        break;

                        case 4:
                            System.out.println("\n----------------------------------------"
                             + "----------------------------------------------------------"
                             + "-------------");
                            for(int j = 0;j<phonebook.size();j++){
                                System.out.println(phonebook.get(j));  
                            }
                            System.out.println("-------------------------------------------"
                                    + "----------------------------------------------------"
                                    + "----------------");
                            break;
                           
                        case 5:
                            System.out.println("------------------------------------------------"
                                    + "Search By Name-------------------------------------------------");
                            p1 = p1.Search(phonebook);
                            if(p1==null){
                                System.out.println("\nThis person does not exist");
         
                            }
                            System.out.println("-------------------------------------------------------"
                                 + "--------------------------------------------------------");
                        break;
                        case 0:
                        break;    
                }
                 System.out.print("Do you want to do another operation on your Phonebook?"
                                   + " (Yes/No): ");
                 c = input2.nextLine();
            }while(c.equals("Yes")||c.equals("yes")||c.equals("Y"));
        System.out.println("\nThank you!");
    }
}
class Persons{
    private String name;
    private String gender;
    private long phonenum;
    private int age;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPhonenum() {
        return phonenum;
    }
 public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
Scanner sc = new Scanner(System.in);

    public Persons addPerson(){
        Persons person = new Persons();
       
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: +91 ");
        long phonenum = sc.nextLong();
        System.out.print("Enter Gender: ");
        String gender = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Mail: ");
        String mail = sc.next();
        System.out.print("Enter Address: ");
        String address = sc.next();

        person.setName(name);
        person.setAge(age);
        person.setPhonenum(phonenum);
        person.setMail(mail);
        person.setGender(gender);
        person.setAddress(address);
        System.out.println(person);
        System.out.println("Added Successfully!");
    return person;
    }
 public Persons Contact1(){
        Persons contact1 = new Persons();
       
        contact1.setName("Debdali");
        contact1.setAge(22);
        contact1.setPhonenum(1234567890);
        contact1.setMail("debdali27@outlook.com");
        contact1.setGender("Female");
        contact1.setAddress("kolkata,India");
    return contact1;
    }
    public Persons Contact2(){
        Persons contact2 = new Persons();
       
        contact2.setName("Suman");
        contact2.setAge(25);
        contact2.setPhonenum(9876543201);
        contact2.setMail("suman123@gmail.com");
        contact2.setGender("Male");
        contact2.setAddress("Kolaghat,India");
    return contact2;
    }
public Persons Contact3(){
        Persons contact3 = new Persons();
       
        contact3.setName("Somnath");
        contact3.setAge(60);
        contact3.setPhonenum(5678904321);
        contact3.setMail("somnath@outlook.com");
        contact3.setGender("Male");
        contact3.setAddress("Gujarat,India");
    return contact3;
    }
       
    public Persons Contact4(){
        Persons contact4 = new Persons();
         
        contact4.setName("Priya");
        contact4.setAge(30);
        contact4.setPhonenum(1111111111);
        contact4.setMail("priya23@gmail.com");
        contact4.setGender("Female");
        contact4.setAddress("Delhi,India");
    return contact4;
    }
 public Persons Contact5(){
        Persons contact5 = new Persons();
           
        contact5.setName("Kajal");
        contact5.setAge(30);
        contact5.setPhonenum(2222222222);
        contact5.setMail("kajal27@outlook.com");
        contact5.setGender("Female");
        contact5.setAddress("Mumbai,India");
    return contact5;
    }
       
    public Persons NametoDelete(LinkedList<Persons> LinkedList){
        Persons person = new Persons();
           
        System.out.print("Enter Contact to Delete: ");
        String name = sc.next();
       
        for(int j = 0;j<LinkedList.size();j++){
            if(name.equals(LinkedList.get(j).getName())){
                System.out.println(LinkedList.get(j));
                person = LinkedList.get(j);
                return person;
            }
            else{
                person = null;
            }
        }
        return person;
    }
 public Persons NametoModify(LinkedList<Persons> LinkedList){
        Persons person = new Persons();
        System.out.print("Enter Contact to Modify: ");
        String name = sc.next();
       
        for(int j = 0;j<LinkedList.size();j++){
            if(name.equals(LinkedList.get(j).getName())){
            System.out.println(LinkedList.get(j));
            person = LinkedList.get(j);
            return person;
            }
            else{
                person = null;
            }
        }
    return person;
    }      
       
public Persons Modify(){
        Persons person = new Persons();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Gender:");
        String gender = sc.next();
        System.out.print("Enter Phone Number:+91 ");
        long phonenum = sc.nextLong();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        System.out.print("Enter Mail:");
        String mail = sc.next();
        System.out.print("Enter Address:");
        String address = sc.next();

        person.setName(name);
        person.setAge(age);
        person.setPhonenum(phonenum);
        person.setMail(mail);
        person.setGender(gender);
        person.setAddress(address);
        System.out.println(person);
        System.out.println("\nModified Successfully!");
        return person;
    }  
 public Persons Search(LinkedList<Persons> Linkedlist){
        Persons person = new Persons();
        System.out.print("Enter Name to search PhoneBook: ");
        String name = sc.next();
        for(int j = 0;j<Linkedlist.size();j++){
            if(name.equals(Linkedlist.get(j).getName())){
                System.out.println(Linkedlist.get(j));
                person = Linkedlist.get(j);
            return person;
            }
            else {
                person = null;
            }
        }
    return person;
    }

   
    @Override
    public String toString() {
    return "Name = " + name + ", Gender = " + gender + ", Phone Number = "+("+91 ") + phonenum +
    ", Age = " + age + ", Mail = " + email + ", Address = " + address + "\n";
    }
}