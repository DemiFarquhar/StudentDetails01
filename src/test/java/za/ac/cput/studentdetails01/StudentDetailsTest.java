
package za.ac.cput.studentdetails01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Breyton Ernstzen
 */
public class StudentDetailsTest {
    
    @Disabled("Disable all test as given by intruction")
     

     @Test
     @Timeout (5)
    public void testEquility() throws InterruptedException{
        StudentDetails student = new  StudentDetails();
        StudentDetails majorSubject = new  StudentDetails();
        StudentDetails minorSubject = new  StudentDetails();
        StudentDetails calcAverage = new  StudentDetails();
        
        String expectedname = student.getStudentName();
        String actualname = "John";
        assertEquals(expectedname,actualname);
        
        String expectedMajor = majorSubject.getMajorsubject();
        String actualMajor = "Maths";
        assertEquals(expectedMajor,actualMajor);
        
        String expectedMinor = minorSubject.getMinorsubject();
        String actualMinor = "Linux";
        assertEquals(expectedMinor,actualMinor);
        
        double expectedAverage = calcAverage.getAverageamount();
        String actualAverage = "60";
        assertEquals(expectedAverage,actualAverage);
         }
    
    
     @Test
     @Timeout (5)
    public void testIdentity () throws InterruptedException{
       StudentDetails  student = new StudentDetails ();
       StudentDetails  majorSubject = new StudentDetails ();
       StudentDetails  minorSubject = new StudentDetails ();
       StudentDetails  calcAverage = new StudentDetails (); StudentDetails calc2Average = calcAverage;
        
        assertSame("John",student.getStudentName());
        assertNotSame("Jade",student.getStudentName());
        
        assertSame("Maths",majorSubject.getMajorsubject());
        assertNotSame("Projects",student.getStudentName());
        
        assertSame("Linux",minorSubject.getMinorsubject());
       
        
        assertSame(calcAverage,calc2Average);
        assertNotSame(student,majorSubject);
        
    }
    
     @Test
     @Timeout (5)
    public void testFailure () throws InterruptedException{
          StudentDetails majorSubject = new  StudentDetails();
          StudentDetails minorSubject = new  StudentDetails();
         
        String expectedMajor = majorSubject.getMajorsubject();
        String actualMajor = "Afrikaans";
        assertEquals(expectedMajor,actualMajor);
        
        String expectedMinor = minorSubject.getMinorsubject();
        String actualMinor = "Projects";
        assertEquals(expectedMinor,actualMinor);
        
    }
    
    @Test
     @Timeout (5)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("Test passed with good time");
    }

    
    
    
    
    
    
    
    
    
    public StudentDetailsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
