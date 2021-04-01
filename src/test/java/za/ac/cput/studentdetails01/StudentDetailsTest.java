
package za.ac.cput.studentdetails01;




import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Breyton Ernstzen
 */
public class StudentDetailsTest {
    
    
     

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
    }
        @Test
                public void testAverageEquility(){
         StudentDetails calcAverage = new  StudentDetails();     
                    
                    
        double expectedAverage = calcAverage.getAverageamount();
        double actualAverage = 60;
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
        String actualMajor = "Maths";
        assertEquals(expectedMajor,actualMajor);
        
        String expectedMinor = minorSubject.getMinorsubject();
        String actualMinor = "Linux";
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
    

   
    
}
