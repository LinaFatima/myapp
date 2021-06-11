package com.example.lab17thmay.Model;

public class Student {
  String Name, RollNo; //student class mian objects defined and main act java main simple add in list

    //empty constructor
    public Student() {
    }
    //parameterized constructor
    public Student(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }
}
