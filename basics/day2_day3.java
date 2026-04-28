/*Problem Statement — Loops + Switch + Break/Continue

Create a menu-driven program using loops and switch-case with the following menu:

1 → Print numbers from 1 to N
2 → Print factorial of a number
3 → Print sum of first N natural numbers
4 → Print multiplication table of a number
5 → Print all even numbers between 1 and N
6 → Skip multiples of 5 between 1 and N (use continue)
7 → Stop at first number divisible by 7 (use break)
0 → Exit
REQUIREMENT:
1.Use switch-case for menu options.
2. Use continue in option 6
Skip all numbers that are multiples of 5.
3. Use break in option 7
Stop the loop when a number divisible by 7 is found.
4. For each option:
Ask user for the required input (like N or number)
Perform calculation using loops
Print the result*/

import java.util.*;
public class day2_day3 {
    public static void main(String args[])
    {
        int no, sum = 0, ch;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Print numbers from 1 to N");
            System.out.println("2. Print factorial of a number");
            System.out.println("3. Print sum of first N natural numbers");
            System.out.println("4. Print multiplication table of a number");
            System.out.println("5. Print all even numbers between 1 and N");
            System.out.println("6. Skip multiples of 5 between 1 and N (use continue)");
            System.out.println("7. Stop at first number divisible by 7 (use break)");
            System.out.println("0. Exit");
            System.out.println("========================");
            
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            if(ch == 0)
            {
                System.out.println("Thank you for using !!");
                break;
            }

            switch(ch)
            {
                case 1:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    for(int i = 1; i <= no; i++)
                    {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    int fact = 1;
                    for(int i = 1; i <= no; i++)
                    {
                        fact *= i;
                    }
                    System.out.println("Factorial is: " + fact);
                    break;

                case 3:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    sum = 0;
                    for(int i = 1; i <= no; i++)
                    {
                        sum += i;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 4:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    for(int i = 1; i <= 10; i++)
                    {
                        System.out.println(no + " * " + i + " = " + no * i);
                    }
                    break;

                case 5:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    for(int i = 0; i <= no; i++)
                    {
                        if(i % 2 == 0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    for(int i = 0; i <= no; i++)
                    {
                        if(i % 5 == 0)
                        {
                            continue;
                        }
                        System.out.print(i + " ");
                    }
                    break;

                case 7:
                    System.out.println("Enter number:");
                    no = sc.nextInt();
                    for(int i = 1; i <= no; i++)
                    {
                        if(i % 7 == 0)
                        {
                            break;
                        }
                        System.out.print(i + " ");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
