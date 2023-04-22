package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Score:\n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 123.0\n" +
                "Exam 4 -> 96.0\n";

        // When
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "";

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void testSetExamScore () {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "";

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void testToString () {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);
        String expected = "";

        // When
        String output = student.toString();

        // Then
        Assert.assertEquals(expected, output);
    }


}