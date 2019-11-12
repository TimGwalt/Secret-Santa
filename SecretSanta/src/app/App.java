package app;

import java.util.Scanner;

public class App {

    public static Scanner kbd = new Scanner(System.in);

    private static Person AddPeople(int count) {
        String name, partner;
        boolean couple;
        
        System.out.println("Name: ");
        name = kbd.nextLine();
        System.out.println("Is this person part of a couple? (true/false)");
        couple = kbd.nextBoolean();
        System.out.println("Partner's name: ");
        partner = kbd.nextLine();
            
        return new Person(name, couple, partner);
    }

    public static void main(String[] args) throws Exception {
        
        // The number of people you would like to add.
        int count; 
        System.out.print("Number of Participants: ");
        count = kbd.nextInt(); // Gets the 

        // Init new array of Person objects. (People)
        Person[] people = new Person[count];

        // Adds peopel's information from command line.
        for (int i = 0; i < count; i++) {
            people[i] = AddPeople(count);
        }
        

        // Testing the person objects
        // Remove later
        for (int i = 0; i < count; i++) {
        	System.out.println(people[i].getName());
        	System.out.println(people[i].isInCouple());
        	System.out.println(people[i].getPartnerName());
        }
        
    }
}