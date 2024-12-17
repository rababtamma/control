package com.example.demo.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Computer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPc;
    String proce;
    String ram;
    String hardDrive;
    double price;

    public Computer(Long idPc, String proce, String ram, String hardDrive, double price) {
        this.idPc = idPc;
        this.proce = proce;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.price = price;
    }

    public Computer() {

    }

    public Long getIdPc() {
        return idPc;
    }

    public String getProce() {
        return proce;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setIdPc(Long idPc) {
        this.idPc = idPc;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}