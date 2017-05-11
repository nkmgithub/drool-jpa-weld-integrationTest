package org.drool.rules.bean;

public class Product {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRotations() {
        return rotations;
    }

    public void setRotations(int rotations) {
        this.rotations = rotations;
    }

    public Double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    private String account;
    private Double totalAmount;
    private Double price;
    private String description;
    private int rotations;
    private Double installmentAmount;


    public Product(String version, String account, Double totalAmount) {
        this.version = version;
        this.account = account;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "version='" + version + '\'' +
                ", account='" + account + '\'' +
                ", totalAmount=" + totalAmount +
                ", price=" + price +
                ", desciption='" + description + '\'' +
                ", rotations=" + rotations +
                ", installmentAmount=" + installmentAmount +
                '}';
    }
}
