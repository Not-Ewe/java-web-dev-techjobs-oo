package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    Job first_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job second_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId() { assertEquals(second_job.getId(),
                                        first_job.getId() + 1);}

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
//        Job test_job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//        Job test_job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
//                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertFalse(first_job == second_job);
    }
}
