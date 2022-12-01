/**
 * Globe FinTech Innovations, Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package adapter;

/**
 * @author Tahseen Babu
 * @version $Id: BankDetails.java, v 0.1 2022-11-02 18:04 Tahseen Babu Exp $$
 */
public class BankDetails {
    private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}