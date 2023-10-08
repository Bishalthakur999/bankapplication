package com.bishalthakur.atmapp;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationIntf{
    ATM atm=new ATM();
    Map<Double,String> ministmt= new HashMap<>();
    @Override
    public void viewBalanceMethod() {
        System.out.println("Available balance is="+atm.getBalance());
        System.out.println("*************************************************************");

    }

    @Override
    public void withdrawAmountMethod(double withdrawAmount) {
      if(withdrawAmount<atm.getBalance()){
          ministmt.put(withdrawAmount,"Amount withdrawn");
          System.out.println("Collect the cash...."+withdrawAmount);
          atm.setBalance(atm.getBalance()-withdrawAmount);
          viewBalanceMethod();
          System.out.println("*************************************************************");
      }else{
          System.out.println("Insufficent balance.....!!");
          System.out.println("*************************************************************");
      }


    }

    @Override
    public void depositAmountMethod(double depositAmount) {
        ministmt.put(depositAmount,"Amount deposited");
        atm.setBalance(depositAmount+ atm.getBalance());
        System.out.println("*************************************************************");

    }

    @Override
    public void viewMiniStatementMethod() {
        for (Map.Entry<Double,String> m: ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



    }
}
