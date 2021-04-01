
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
 * 
 * Testing methods for a small StudentDetails program
 * Testing done by Zubair Esau - 217100554
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
        String actualname = "John";                         //Tesing equality for student name
        assertEquals(expectedname,actualname);
        
        String expectedMajor = majorSubject.getMajorsubject();
        String actualMajor = "Maths";                      //Testing equaliy for major subject
        assertEquals(expectedMajor,actualMajor);
        
        String expectedMinor = minorSubject.getMinorsubject();
        String actualMinor = "Linux";                      //Testing equality for minor subject
        assertEquals(expectedMinor,actualMinor);
    }
        @Test
         public void testAverageEquility(){
         StudentDetails calcAverage = new  StudentDetails();     
                    
        double expectedAverage = calcAverage.getAverageamount();
        double actualAverage = 60;                                  //Testing equality of average without throwing a exception
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
        assertNotSame("Jade",student.getStudentName());       //Testing name identity
        
        assertSame("Maths",majorSubject.getMajorsubject());   //Testing major subject identity
        assertNotSame("Projects",student.getStudentName());
        
        assertSame("Linux",minorSubject.getMinorsubject());   //Testing minor subject identity
       
        
        assertSame(calcAverage,calc2Average);                //Testing average identity
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
                                                                  //Testing for failure of 2 methods
        String expectedMinor = minorSubject.getMinorsubject();
        String actualMinor = "Linux";
        assertEquals(expectedMinor,actualMinor);
        
    }
    
    @Test
     @Timeout (5)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(4000);                                   //Timeout testing
        System.out.println("Test passed with good time");
    }

    
    
    
    
    
    
    
    
    
    
    

   
    
}
