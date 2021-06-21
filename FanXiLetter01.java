package com.FanXi;

import java.util.ArrayList;
import java.util.Comparator;


/**
 * @author liu
 * @version 1.0
 */
public class FanXiLetter01 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("张三1",3000,new MyDate(5,2,1991)));
        arrayList.add(new Employee("李四2",2000,new MyDate(3,5,1993)));
        arrayList.add(new Employee("王五3",5000,new MyDate(6,1,1992)));

        arrayList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getName().length() != e2.getName().length()) {
                    return e1.getName().length() - e2.getName().length();
                }

                if (e1.getBirthday().compareTo(e2.getBirthday()) != 0) {
                    return e1.getBirthday().compareTo(e2.getBirthday());
                }

                return 0;
            }
        });

        System.out.println(arrayList);
    }
}

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public MyDate() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                 year +
                "-" + month +
                "-" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        if (this.year != o.year) {
            return this.year - o.year;
        }

        if (this.month != o.month) {
            return this.month - o.month;
        }

        if (this.day != o.day) {
            return this.day - o.day;
        }
        return 0;
    }
}