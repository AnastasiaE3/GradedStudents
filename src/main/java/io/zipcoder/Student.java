package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    Double[] examScores;

    public Student (String firstName, String lastName, Double[] testScores) {
        this.examScores = testScores;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   public String getExamScores() {
       StringBuilder scores = new StringBuilder();
       scores.append("Exam Scores:\n");
       for (int i = 0; i < scores.length(); i ++) {
           scores.append("Exam");
           scores.append(i + 1);
           scores.append(" -> ");
           scores.append(examScores[i]);
           scores.append("\n");
       }
       return String.valueOf(examScores);
   }

   public void addExamScore(double examScore) {
        Double[] newScores = Arrays.copyOf(examScores, examScores.length + 1);
        newScores[newScores.length - 1] = examScore;
        examScores = newScores;
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores[examNumber] = newScore;
    }
    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < examScores.length; i ++) {
            sum += examScores[i];
        }
        return sum/examScores.length;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Student Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n");
        str.append("> Average Score: ").append(getAverageExamScore()).append("\n");
        str.append("> ").append(getExamScores());
        return String.valueOf(str);
    }




}
