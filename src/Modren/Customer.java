package Modren;

import java.time.LocalDate;

public class Customer  {
    private String ID;
    private String Name;
    private String items;
    private LocalDate Date;
    private double Salary;


    public Customer (String ID, String name, String items, LocalDate date, double salary) {
        this.ID = ID;
        Name = name;
        this.items = items;
        Date = date;
        Salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "cu{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", items='" + items + '\'' +
                ", Date=" + Date +
                ", Salary=" + Salary +
                '}';
    }
}
