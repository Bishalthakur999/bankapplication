package com.bishalthakur.atmapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mainclass {

    public static void main(String[] args) {
        AtmOperationIntf op=new AtmOperationImpl();
        int atmNumber=12345;
        int atmPin=123;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ATMNumber==>");
        int atmnumber=sc.nextInt();
        System.out.println("Enter the ATMPIN==>");
        int atmpin=sc.nextInt();

        if((atmNumber==atmnumber) && (atmPin==atmpin)){
            System.out.println("------------Welcome to our service-----------------");

            while(true){
                System.out.println("1)view balance\n"+"2)withdraw balance\n"+"3)Deposit balance\n"+"4)view mini statement\n"+"5) exit");
                System.out.println("Enter the choice==>");
                int ch=sc.nextInt();

                switch (ch){
                    case 1:
                        op.viewBalanceMethod();
                        break;
                    case 2:
                        System.out.println("Enter the withdraw amount==>");
                        double withdrawAmount= sc.nextDouble();
                        op.withdrawAmountMethod(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter the deposit amount==>");
                        double depositAmoun= sc.nextDouble();
                        op.depositAmountMethod(depositAmoun);
                        break;
                    case 4:
                        op.viewMiniStatementMethod();
                        break;
                    case 5:
                        System.out.println("Collect your atm card.......");
                        System.exit(0);
                        break;

                }
            }

        }
        else {
            System.out.println("Atm no doesnot match!!!");
            System.exit(0);
        }
    }
}
