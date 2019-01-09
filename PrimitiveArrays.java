/*
package Assignment3;


import java.util.Scanner;

// Write a program to take the inputs in the following order and display the result as shown below.
//Your program should use primitive arrays and for loop to get this work.
//number of students, id as int, name as string, fee as double and section as char
public class PrimitiveArrays {
    public static void main(String[] args){
        Scanner Uni =new Scanner(System.in);
        System.out.println("Enter number of students");
        int numofStudents = Uni.nextInt();
        Student[] st = new Student[numofStudents];
        for(int i=0;i<numofStudents;i++){
            System.out.println("Enter Student"+(i+1)+"id");
            int sid = Uni.nextInt();
            System.out.println("Enter Student"+(i+1)+"name");
            String sName =Uni.next();
            System.out.println("Enter Student"+(i+1)+"Fee");
            Float sFee = Uni.nextFloat();
            System.out.println("Enter Student"+(i+1)+"Section");
            String sSec = Uni.next();
            System.out.println("");
            Student s;
            s = new Student();
            st[i]= s;
        }
        System.out.println("id\tName\tFee\tSec");
        for(int j=0; j<st.length;j++)
            //System.out.printf("%s\t%s\t%s\t%s\t%n", st[j].getid(), st[j].getsName(), st[j].getsFee(), st[j].getSec());
    }

    private static class Student {
        public void getSec() {
        }

        public Object getsName() {
            Object sName;
            return sName;
        }

        public void setsName(Object sName) {
            this.sName = sName;
        }

        public float getid() {
            return 0;
        }

        public float getsFee() {
            return sFee;
        }

        public void setsFee(float sFee) {
            this.sFee = sFee;
        }
    }
}
*/
