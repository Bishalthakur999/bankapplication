package com.bishalthakur.atmapp;

public interface AtmOperationIntf {
    public void viewBalanceMethod();
    public void withdrawAmountMethod(double  withdrawAmount);
    public void depositAmountMethod(double depositAmount);
    public void viewMiniStatementMethod();
}
