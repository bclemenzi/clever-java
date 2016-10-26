package com.evotext.clever;

import java.math.BigInteger;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import com.evotext.clever.model.District;
import com.evotext.clever.model.School;
import com.evotext.clever.model.Section;
import com.evotext.clever.model.Student;
import com.evotext.clever.model.Teacher;

/**
 * 
 * @author Brendan Clemenzi
 * @email brendan@clemenzi.com
 */
public class DistrictTest
{
    private String DISTRICT_OAUTH_TOKEN = "DEMO_TOKEN"; // set your district
                                                        // oAuth token here

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testDistricts() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistricts");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        District districtValue = cleverClient.getDistrict();
        System.out.println("testDistricts Name: " + districtValue.getName());

        if (districtValue != null)
        {
            assertTrue(true);
        }

        System.out.println("====> Finished DistrictTest.testDistricts");
    }

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testDistrictSchools() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictSchools");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        List<School> schoolList = cleverClient.getDistrictSchools("4fd43cc56d11340000000005", 10, null, null);

        boolean hasSchools = false;
        for (School schoolValue : schoolList)
        {
            System.out.println("testDistrictSchools School: " + schoolValue.getName());

            hasSchools = true;
        }

        assertTrue(hasSchools);

        System.out.println("====> Finished DistrictTest.testDistrictSchools");
    }

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testCountDistrictSchools() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testCountDistrictSchools");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        BigInteger schoolTotal = cleverClient.countDistrictSchools("4fd43cc56d11340000000005");
        System.out.println("testCountDistrictSchools Count: " + schoolTotal.toString());

        if (schoolTotal.intValue() > 0)
        {
            assertTrue(true);
        }

        System.out.println("====> Finished DistrictTest.testCountDistrictSchools");
    }

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testDistrictTeachers() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictTeachers");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        String districtId = "4fd43cc56d11340000000005";

        BigInteger teacherCount = cleverClient.countDistrictTeachers(districtId);
        System.out.println("testDistrictTeachers Totol: " + teacherCount.toString());

        List<Teacher> teacherList = cleverClient.getDistrictTeachers(districtId, 10, null, null);

        boolean hasTeachers = false;
        for (Teacher teacherValue : teacherList)
        {
            System.out.println("testDistrictTeachers Teacher: " + teacherValue.getName());

            hasTeachers = true;
        }

        assertTrue(hasTeachers);

        System.out.println("====> Finished DistrictTest.testDistrictTeachers");
    }
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllDistrictTeachers() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testAllDistrictTeachers");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        String districtId = "4fd43cc56d11340000000005";

        List<Teacher> teacherList = cleverClient.getAllDistrictTeachers(districtId);

        boolean hasTeachers = false;
        for (Teacher teacherValue : teacherList)
        {
            System.out.println("testDistrictTeachers Teacher: " + teacherValue.getName());

            hasTeachers = true;
        }

        assertTrue(hasTeachers);

        System.out.println("====> Finished DistrictTest.testAllDistrictTeachers");
    }

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testDistrictStudents() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictStudents");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        List<Student> studentList = cleverClient.getDistrictStudents("4fd43cc56d11340000000005", 10, null, null);

        boolean hasStudents = false;
        for (Student studentValue : studentList)
        {
            System.out.println("testDistrictStudents Student: " + studentValue.getName());

            hasStudents = true;
        }

        assertTrue(hasStudents);

        System.out.println("====> Finished DistrictTest.testDistrictStudents");
    }

    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllDistrictStudents() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictStudents");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        List<Student> studentList = cleverClient.getAllDistrictStudents("4fd43cc56d11340000000005");

        boolean hasStudents = false;
        for (Student studentValue : studentList)
        {
            System.out.println("testDistrictStudents Student: " + studentValue.getName());

            hasStudents = true;
        }

        assertTrue(hasStudents);

        System.out.println("====> Finished DistrictTest.testDistrictStudents");
    }
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testDistrictSections() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testDistrictSections");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        List<Section> sectionList = cleverClient.getDistrictSections("4fd43cc56d11340000000005", 10, null, null);

        boolean hasSections = false;
        for (Section sectionValue : sectionList)
        {
            System.out.println("testDistrictSections Section: " + sectionValue.getName());

            hasSections = true;
        }

        assertTrue(hasSections);

        System.out.println("====> Finished DistrictTest.testDistrictSections");
    }
    
    /**
     * 
     * @throws Exception
     */
    @Test
    public void testAllDistrictSections() throws Exception
    {
        System.out.println("====> Starting DistrictTest.testAllDistrictSections");

        CleverDistrictsClient cleverClient = new CleverDistrictsClient(DISTRICT_OAUTH_TOKEN);

        List<Section> sectionList = cleverClient.getAllDistrictSections("4fd43cc56d11340000000005");

        boolean hasSections = false;
        for (Section sectionValue : sectionList)
        {
            System.out.println("testAllDistrictSections Section: " + sectionValue.getName());

            hasSections = true;
        }

        assertTrue(hasSections);

        System.out.println("====> Finished DistrictTest.testAllDistrictSections");
    }
}
