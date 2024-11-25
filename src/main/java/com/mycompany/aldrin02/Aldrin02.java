/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aldrin02;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Aldrin02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
       System.out.println("Welcome to vote registration");
       
       System.out.println("Enter your name:");
       String name = input.nextLine();
       System.out.println("Enter your address:");
       String address = input.nextLine();
       System.out.println("Enter your age:");
       int age = input.nextInt();
       
        if(age<=17)
            
        {
        System.out.println("Not Qualify to vote");
        System.out.println("Your name is " + name + " you are " + age + " from " + address);
        }
        else if(age>=18)
            
        {
        System.out.println("Qualify to vote");
        System.out.println("Your name is " + name + " you are " + age + " from " + address);
        }
        else
        {
        System.out.println("ediwow");
        }
    }
}
