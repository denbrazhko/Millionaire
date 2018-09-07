package com.dendev.millionaire.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Info {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String firstName;

    private String secName;

    private long firstBalance;

    private long secBalance;

    private long time;

    private int age;

    private int housing;

    private int transport;

    private boolean isPTU;

    private boolean isIT;

    private boolean isUniversity;

    private double carWashExp;

    private double dvornikExp;

    private double callCenterExp;

    private double mcDonaldsExp;

    private double santechnikExp;

    private double factoryExp;

    private double tocarExp;

    private double builderExp;

    private double cookExp;

    private boolean isWorkBook;

    private boolean isSanBook;

    private boolean isDriversLicense;

    private boolean isInvalid;

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public long getFirstBalance() {
        return firstBalance;
    }

    public void setFirstBalance(long firstBalance) {
        this.firstBalance = firstBalance;
    }

    public long getSecBalance() {
        return secBalance;
    }

    public void setSecBalance(long secBalance) {
        this.secBalance = secBalance;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHousing() {
        return housing;
    }

    public void setHousing(int housing) {
        this.housing = housing;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public boolean isPTU() {
        return isPTU;
    }

    public void setPTU(boolean PTU) {
        isPTU = PTU;
    }

    public boolean isIT() {
        return isIT;
    }

    public void setIT(boolean IT) {
        isIT = IT;
    }

    public boolean isUniversity() {
        return isUniversity;
    }

    public void setUniversity(boolean university) {
        isUniversity = university;
    }

    public double getCarWashExp() {
        return carWashExp;
    }

    public void setCarWashExp(double carWashExp) {
        this.carWashExp = carWashExp;
    }

    public double getDvornikExp() {
        return dvornikExp;
    }

    public void setDvornikExp(double dvornikExp) {
        this.dvornikExp = dvornikExp;
    }

    public double getCallCenterExp() {
        return callCenterExp;
    }

    public void setCallCenterExp(double callCenterExp) {
        this.callCenterExp = callCenterExp;
    }

    public double getMcDonaldsExp() {
        return mcDonaldsExp;
    }

    public void setMcDonaldsExp(double mcDonaldsExp) {
        this.mcDonaldsExp = mcDonaldsExp;
    }

    public double getSantechnikExp() {
        return santechnikExp;
    }

    public void setSantechnikExp(double santechnikExp) {
        this.santechnikExp = santechnikExp;
    }

    public double getFactoryExp() {
        return factoryExp;
    }

    public void setFactoryExp(double factoryExp) {
        this.factoryExp = factoryExp;
    }

    public double getTocarExp() {
        return tocarExp;
    }

    public void setTocarExp(double tocarExp) {
        this.tocarExp = tocarExp;
    }

    public double getBuilderExp() {
        return builderExp;
    }

    public void setBuilderExp(double builderExp) {
        this.builderExp = builderExp;
    }

    public double getCookExp() {
        return cookExp;
    }

    public void setCookExp(double cookExp) {
        this.cookExp = cookExp;
    }

    public boolean isWorkBook() {
        return isWorkBook;
    }

    public void setWorkBook(boolean workBook) {
        isWorkBook = workBook;
    }

    public boolean isSanBook() {
        return isSanBook;
    }

    public void setSanBook(boolean sanBook) {
        isSanBook = sanBook;
    }

    public boolean isDriversLicense() {
        return isDriversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        isDriversLicense = driversLicense;
    }

    public boolean isInvalid() {
        return isInvalid;
    }

    public void setInvalid(boolean invalid) {
        isInvalid = invalid;
    }
}
