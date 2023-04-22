package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void testGetStudents() {
        Student s1 = new Student("Serah", "Tutelkin", new Double[]{150.0});
        Student s2 = new Student("Ana", "Jopa", new Double[]{100.0});
        Student s3 = new Student("Andrey", "Sosulkin", new Double[]{67.0});
        Classroom croom = new Classroom(3,s1, s2,s3);

        Student[] actual = croom.getStudents();

        Assert.assertEquals(actual[0], s1);
        Assert.assertEquals(actual[1], s2);
        Assert.assertEquals(actual[2], s3);


    }
}
