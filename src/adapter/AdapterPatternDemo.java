/**
 * Globe FinTech Innovations, Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package adapter;

/**
 * @author Tahseen Babu
 * @version $Id: AdapterPatternDemo.java, v 0.1 2022-11-02 18:14 Tahseen Babu Exp $$
 */
public class AdapterPatternDemo {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}