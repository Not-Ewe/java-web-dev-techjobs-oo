package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


//public class JobTest {
//    Job first_job;
//    Job second_job;
//
//    @Before
//    public void createJobObjects() {
//    Job first_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//    Job second_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//    }
//
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
//
//    @Test
//    public void testSettingJobId() { assertEquals(first_job.getId(), second_job.getId() - 1);}
//
//    @Test
//    public void testJobConstructorSetsAllFields() {
//        assertTrue(first_job instanceof Job);
//        assertEquals(first_job.getName(), "Product Tester");
//        assertEquals(first_job.getEmployer().toString(), "ACME");
//        assertEquals(first_job.getLocation().toString(), "Desert");
//        assertEquals(first_job.getPositionType().toString(), "Quality Control");
//        assertEquals(first_job.getCoreCompetency().toString(), "Persistence");
//    }
//
//    @Test
//    public void testJobsForEquality() {
//        assertFalse(first_job == second_job);
//    }
//
////    @Test
////    public void testJobObjectReturnsStringWithBlankLineBeforeAndAfter() {}
////
////
////    @Test
////    public void testJobObjectContainsLabelsAndDataForEachField() {}
////
////    @Test
////    public void testErrorMessageWhenFieldIsEmpty() {}
////
////    @Test
////    public void testErrorMessageWhenOnlyIdFieldContainsData() {}
//
//}
public class JobTest {


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job2.getId(), job1.getId() + 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(test_job instanceof Job);
        assertEquals(test_job.getName(), "Product Tester");
        assertEquals(test_job.getEmployer().toString(), "ACME");
        assertEquals(test_job.getLocation().toString(), "Desert");
        assertEquals(test_job.getPositionType().toString(), "Quality Control");
        assertEquals(test_job.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job first_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job second_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertFalse(first_job == second_job);
        assertTrue(first_job != second_job);
    }

    @Test
    public void testReturnsStringWithBlankLineBeforeAndAfter() {
        Job first_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(first_job.toString().startsWith("\n"));
        assertTrue(first_job.toString().endsWith("\n"));
    }

    @Test
    public void testReturnsStringWithLabelAndDataForAllFields() {
        Job first_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertEquals(first_job.toString(), "\n" +
                "ID: " + first_job.getId() + "\n" +
                "Name: " + first_job.getName() + "\n" +
                "Employer: " + first_job.getEmployer() + "\n" +
                "Location: " + first_job.getLocation() + "\n" +
                "Position Type: " + first_job.getPositionType() + "\n" +
                "Core Competency: " + first_job.getCoreCompetency() + "\n");
    }

    @Test
    public void testEmptyFieldsShowErrorMessage() {
        Job first_job = new Job("Product Tester", new Employer(), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertTrue(first_job.toString().contains("Employer: Data Not Available"));
    }
}