package com.finepointstudios;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {100, 50, 70, 60, 80, 60};
        Student student = new Student("Daniel", "Malone", 2, numbers);
        char asdf = student.calculate();
        System.out.println(asdf);
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate() {
        int total = 0;
        int i;
        for (i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }
        int totalCalculated = total / i;
//        System.out.println(totalCalculated);
        if (totalCalculated >= 90 && totalCalculated <= 100) {
            return 'O';
        } else if (totalCalculated >= 80 && totalCalculated < 90) {
            return 'E';
        } else if (totalCalculated >= 70 && totalCalculated < 80) {
            return 'A';
        } else if (totalCalculated >= 55 && totalCalculated < 70) {
            return 'P';
        } else if (totalCalculated >= 40 && totalCalculated < 55) {
            return 'D';
        }
        return 'T';
    }
}
