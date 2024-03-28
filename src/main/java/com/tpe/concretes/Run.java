package com.tpe.concretes;
import com.tpe.Controller.RegisterController;
import com.tpe.Controller.UserAuthenticationManager;
import com.tpe.helpers.Slow;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void run(){
        Scanner input = new Scanner(System.in);
        String s = "Have a nice day...";

        UserAuthenticationManager userAuthenticationManager
                = new UserAuthenticationManager();
        RegisterController registerController
                = new RegisterController();
        int select =-1;

        do {
            System.out.println();
            String message= "========== WELCOME TO NOTE PAD ==========\n";
            Slow.slowPrint(message,10);
            System.out.println("Please Select Your Menu");
            System.out.println("1--> Login");
            System.out.println("2--> Register");
            System.out.println("0-->Exit");

            try {
                select= input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please select with menu number");
                run();
            }
            switch (select){
                case 1 :
                    //to do method  login
                    break;
                case 2:
                 registerController.startRegister();
                    break;
                case 0:
                    Slow.slowPrint(s,30);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry try again");
                    break;
            }

        }while (true);
    }
}
