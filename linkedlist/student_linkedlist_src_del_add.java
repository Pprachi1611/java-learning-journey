/*Problem Statement

Create a menu-driven program using LinkedList<Student> with the following operations:
1 → Add Student
2 → Display All Students
3 → Search Student by Roll
4 → Delete Student by Roll
5 → Update Student Marks
0 → Exit

Student class has:
roll
name
marks */
import java.util.*;

class Student {
    int roll;
    String name;
    double marks;

    Student(int r, String s, double m) {
        roll = r;
        name = s;
        marks = m;
    }

    public String toString() {
        return roll + "  " + name + "  " + marks;
    }
}

public class student_linkedlist_src_del_add {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll");
            System.out.println("4. Delete Student by Roll");
            System.out.println("5. Update Student Marks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 0) {
                System.out.println("Thank you!");
                break;
            }

            switch (ch) {

                case 1:
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(r, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n*** Student Details ***");
                    for (Student s : list) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll to Search: ");
                    int sr = sc.nextInt();
                    boolean found = false;

                    for (Student s : list) {
                        if (s.roll == sr) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter Roll to Delete: ");
                    int dr = sc.nextInt();

                    boolean removed = list.removeIf(s -> s.roll == dr);

                    if (removed)
                        System.out.println("Record Deleted!");
                    else
                        System.out.println("Roll not found!");
                    break;

                case 5:
                    System.out.print("Enter Roll to Update Marks: ");
                    int ur = sc.nextInt();

                    boolean updated = false;
                    for (Student s : list) {
                        if (s.roll == ur) {
                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();
                            updated = true;
                            System.out.println("Marks Updated!");
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Roll not found!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
