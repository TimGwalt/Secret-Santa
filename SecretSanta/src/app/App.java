package app;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static Scanner kbd = new Scanner(System.in);


    /**
     * PrintArray() prints the given array of person objects.
     * @param people
     */
    private static void printArray(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + " -> " + people[i].getAssignment());
        }
    }

    /**
     * AddPerson()gathers person data and returns 
     * a person object with data.
     * @return Person(name, couple, partner).
     */
    private static Person AddPerson() {
        String name, partner;
        boolean couple;
        
        System.out.println("Name: ");
        name = kbd.next();
        System.out.println("Is this person part of a couple? (true/false)");
        couple = kbd.nextBoolean();
        System.out.println("Partner's name: ");
        partner = kbd.next();
            
        return new Person(name, couple, partner);
    }

    
    private static void picker(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            int rand = new Random().nextInt(people.length);

            // This loop makes sure that no one is assigned multiple times.
            while(rand == i || people[i].isAssigned()) {
                rand = new Random().nextInt(people.length);
            }

            people[i].setAssignment(people[rand].getName());
            people[i].setAssign(true);
        }

        printArray(people);

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
            people[i] = AddPerson();
        }

        picker(people);

        // Testing the person objects
        // Remove later
        for (int i = 0; i < count; i++) {
        	System.out.println(people[i].getName());
        	System.out.println(people[i].isInCouple());
        	System.out.println(people[i].getPartnerName());
        }
        
    }
}