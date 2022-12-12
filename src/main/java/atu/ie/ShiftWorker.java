package atu.ie;


import java.util.Objects;

public class ShiftWorker {
    private String Name;
    private String Gender;
    private double Shift;
    private double Age;

    public ShiftWorker() {
    }

    public ShiftWorker(String name, String gender, double shift, double age) {
        Name = name;
        Gender = gender;
        Shift = shift;
        Age = age;

        if(name.length() <=6 || name.length() >= 21) {
            throw new IllegalArgumentException("Name provided is not valid");

        }
        if(Age <= 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        if(Gender != "Men" || Gender != "Women"){
            throw new IllegalArgumentException("Invalid gender type");
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
            Name = name;

    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public double getShift() {
        return Shift;
    }

    public void setShift(double shift) {
        Shift = shift;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {

            Age = age;

    }

    @Override
    public String toString(){
        return "Name = '"+ Name +'\'' +
                " ,Gender= "+ Gender + '\''+
                " ,Shift= "+ Shift + '\''+
                " ,Age= "+ Age;
    }


}
