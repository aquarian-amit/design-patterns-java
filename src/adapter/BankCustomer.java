/**
 * Globe FinTech Innovations, Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Tahseen Babu
 * @version $Id: BankCustomer.java, v 0.1 2022-11-02 18:12 Tahseen Babu Exp $$
 */
public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in " + bname +
                "bank is valid and authenticated for issuing the credit card. ");
    }
}