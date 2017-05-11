package org.drool.rules.bean;

public class TestInfo {
    private Double installmentAmount;
    private Double amount;
    private Double collectionAmount;
    private Double dueAmount;


    public TestInfo(Double installmentAmount, Double amount) {
        this.installmentAmount = installmentAmount;
        this.amount = amount;
    }

    public Double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(Double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
                "installmentAmount=" + installmentAmount +
                ", amount=" + amount +
                ", collectionAmount=" + collectionAmount +
                ", dueAmount=" + dueAmount +
                '}';
    }
}
