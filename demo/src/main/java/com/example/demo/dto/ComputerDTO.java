package com.example.demo.dto;


import java.nio.charset.CharacterCodingException;

public class ComputerDTO {

    private String proce;
    private String ram;
    private String hardDrive;
    private double price; // Changed to float as per GraphQL schema


    public ComputerDTO() {}

    // Parameterized constructor for convenience
    public ComputerDTO(String proce, String ram, String hardDrive, double price) {
        this.proce = proce;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.price = price;
    }

    // Getters and setters
    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void sethardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
