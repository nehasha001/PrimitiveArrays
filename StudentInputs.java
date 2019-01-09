package Assignment3;

import java.util.Scanner;
//Write a program to take the inputs in the following order and display the result as shown below.
//Your program should use Student Object to store the Student details(id,name …) and store them in Array of Student type.
//number of students, id as int, name as string, fee as double and section as char
public class StudentInputs {
    public static void main(String[] args) {
        int i, q, z, c, b;
        int x = 0;
        String[] name = new String[30];
        int[] id = new int[30];
        String[] course = new String[30];
        Double[] Fee = new Double[30];
        String[] section = new String[30];
        int StudentChoice;

        Scanner input = new Scanner(System.in);

        start:
        do {

            System.out.println("\t\t\tStudent List");
            System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
            System.out.println("Enter a choice: ");
            StudentChoice = input.nextInt();

            if (StudentChoice == 1) {
                for (z = x; z <= 29; z++) {
                    System.out.println("Full name:");
                    name[z] = input.nextLine();
                    System.out.println("ID:38");
                    id[z] = input.nextInt();
                    System.out.println("Course:Java");
                    course[z] = input.next();
                    System.out.println("Fee:2k");
                    Fee[z] = input.nextDouble();
                    System.out.println("Section:A");
                    section[z] = input.next();
                    x++;
                    continue start;
                }
            } else if (StudentChoice == 2) {
                for (i = 0; i < x; i++) {
                    System.out.println(name[i] + id[i] + course[i] + Fee[i] + section[i]);
                }
            }

        } while (StudentChoice < 4);
    }}