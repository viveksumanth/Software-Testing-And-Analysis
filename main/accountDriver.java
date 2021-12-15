package main;

import java.io.*;
import java.util.InputMismatchException;
import main.account;


public class accountDriver{

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String ch ="start";

        // Creating object of the class
        account ca = new account();     // current account -> CA
        
        try{
            while(ch != "q"){

                System.out.println("---------------------------------------------------------------------");
                System.out.print("Select Operation: ");
                System.out.print("\n");
                System.out.print("	MENU of Operations");
                System.out.print("\n");
                System.out.print("          	0. Open");
                System.out.print("\n");
                System.out.print("          	1. Deposit");
                System.out.print("\n");
                System.out.print("          	2. Withdraw");
                System.out.print("\n");
                System.out.print("          	3. Balance");
                System.out.print("\n");
                System.out.print("          	4. Lock");
                System.out.print("\n");
                System.out.print("          	5. Unlock");
                System.out.print("\n");
                System.out.print("          	6. Login");
                System.out.print("\n");
                System.out.print("          	7. Pin");
                System.out.print("\n");
                System.out.print("          	8. Logout");
                System.out.print("\n");
                System.out.print("          	q. Quit the program");
                System.out.print("\n");
                System.out.print("\n");
                System.out.print("Testing-Related Methods");
                System.out.print("\n");
                System.out.print("          	a. Show Balance");
                System.out.print("\n");
                System.out.print("          	b. Show State");
                System.out.print("\n");
                System.out.print("          	c. Show_Number_Of_Pin_Tries");
                System.out.print("\n");
                System.out.print("          	d. Show_Locked_Flag");
                System.out.print("\n");
                System.out.print("          	e. Show_Pin");
                System.out.print("\n");
                System.out.print("          	f. Show_Account_Number");
                System.out.print("\n");
                System.out.println("---------------------------------------------------------------------");

                System.out.print("\n");
                System.out.println("select a Operation from list of methods in the Chart:");
                System.out.print("\n");
                ch= sc.readLine();

                switch(ch)
                {
                    case "0":  //open
                    {
                        System.out.println("Method OPEN");
                        System.out.print("\n");

                        try {
                            System.out.println("Enter Account Number");
                            System.out.print("\n");
                            int accountNumber = Integer.parseInt(sc.readLine());

                            System.out.println("Enter Passcode/Pin");
                            System.out.print("\n");
                            int passCode = Integer.parseInt(sc.readLine());

                            System.out.println(("Enter Account Balance"));
                            System.out.print("\n");
                            int accountBalance = Integer.parseInt(sc.readLine());

                            int returnCode = ca.open(accountNumber, passCode, accountBalance );
                            System.out.println(" ---- Status Code : " + returnCode + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                        }

                    case "1": //deposit
                    {
                        System.out.println("Method Deposit");
                        System.out.println("\n");
                        try {
                            System.out.println("Enter Amount to deposit");
                            System.out.print("\n");
                            int depositValue = Integer.parseInt(sc.readLine());

                            int returnCode = ca.deposit(depositValue);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;

                    }
                    case "2": //withdraw
                    {
                        try {
                            System.out.println("Enter Amount to withdraw");
                            System.out.print("\n");
                            int withdrawValue = Integer.parseInt(sc.readLine());


                            int returnCode = ca.withdraw(withdrawValue);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }
                    case "3": //balance
                    {
                        System.out.println("Method Balance");
                        System.out.println("\n");
                        int returnCode = ca.balance();

                        if ( returnCode == -1){
                            System.out.println(" ---- Status Code : " + returnCode + "\n");
                        }
                        else{
                            System.out.println(" Balance in the account is : " + returnCode + "\n");
                        }
                        break;
                    }
                    case "4": //lock
                    {
                        try {
                            System.out.println("Enter Lock Pin to Lock the Account");
                            System.out.print("\n");
                            int lockPin = Integer.parseInt(sc.readLine());


                            int returnCode = ca.lock(lockPin);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }
                    case "5": //unlock
                    {
                        System.out.println("Method Unlock");
                        System.out.println("\n");

                        try {
                            System.out.println("Enter lock Pin To Unlock The Account ");
                            System.out.print("\n");
                            int lockPin = Integer.parseInt(sc.readLine());
//                            System.out.println(lockPin);

                            int returnCode = ca.unlock(lockPin);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }
                    case "6": //login
                    {
                        System.out.println("Method LOGIN");
                        System.out.print("\n");

                        try {
                            System.out.println("Enter Pin To Login");
                            System.out.print("\n");
                            int accountNumber = Integer.parseInt(sc.readLine());


                            int returnCode = ca.login(accountNumber);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;
                    }
                    case "7": //pin
                    {
                        System.out.println("Method Pin");
                        System.out.println("\n");

                        try {
                            System.out.println("Enter Pin To Login");
                            System.out.print("\n");
                            int passCode = Integer.parseInt(sc.readLine());


                            int returnCode = ca.pin(passCode);
                            System.out.println(" ---- Status Code : " + returnCode + "\n");

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input - Please Select Again ");
                        } catch (IOException e) {
                            System.out.println("Input IO error");
                        } catch (NumberFormatException e) {
                            System.out.println("Number should be in proper");
                        }
                        break;

                    }
                    case "8": //Logout
                    {
                        System.out.println("Method Logout");
                        System.out.println("\n");
                        int returnCode = ca.logout();
                        System.out.println(" ---- Status Code : " + returnCode + "\n");
                        break;
                    }

                    //Testing methods
                    case "a": //show balance
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Balance at this state is " + ca.showBalance());
                        System.out.println("\n");
                        break;

                    }

                    case "b": // show state
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Current State is " + ca.showState());
                        System.out.println("\n");
                        break;
                    }

                    case "c": //show number of pin tires
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Number of Pin Retries are " + ca.showPinRetries());
                        System.out.println("\n");
                        break;
                    }

                    case "d": //show locked flag
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Locked or Unlocked: " + ca.showLockedFlag());
                        System.out.println("\n");
                        break;
                    }
                    case "e": //show Pin
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Pin : " + ca.showPin());
                        System.out.println("\n");
                        break;
                    }
                    case "f": //show Account Number
                    {
                        System.out.println("This is a Testing Method doesn't exist - Only for DEV Envirorment");
                        System.out.println("\n");
                        System.out.println("Account Number: " + ca.showAccountNumber());
                        System.out.println("\n");
                        break;
                    }
                    case "q":
                    { //Quit
                        System.out.print("  Operation:  Exit");
                        System.out.print("\n");
                        System.exit(0);
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice");
                        break;
                    }
                }
                }
            } catch (NumberFormatException e) {
            System.out.println("Number should be in proper");
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch");

        }catch (IOException e) {
            System.out.println("Input IO error");
        }

    }
    }
