
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
private StudentDetails campus;
private StudentDetails studAdress;
 
public StudentDetailsTest() {
campus=new StudentDetails();
studAdress=new StudentDetails();
    
    }
@Test 
public  void testIdentity() throws InterruptedException{
assertSame("District Six Campus",campus.getCampus());
assertNotSame("Mowbray",campus.getCampus());
assertSame("6 Carter Hout Bay",studAdress.getstudAdress());
assertNotSame("61 Carter Hout Bay",studAdress.getstudAdress());

 }
 @Test
public  void testEquality() throws InterruptedException {
 assertEquals("6 Carter Hout Bay",studAdress.getstudAdress());   
 assertEquals("District Six Campus",campus.getCampus());

}
@Test 
@Disabled("Disable test")
public void testDisable() throws InterruptedException{
String expectedStudAdress=studAdress.getstudAdress();
String actualStudAdress="6 Carter Hout Bay";
assertEquals(expectedStudAdress,actualStudAdress);    
}
@Test
public void testGetCampus() throws InterruptedException {
System.out.println("getCampus");
Report instance = new Report();
String expResult = "";
String result = instance.getCampus();
assertEquals(expResult, result);
fail("The test case is a prototype.");
 }

@Test
@Timeout(2)
public void timeOut() throws InterruptedException{
  Thread.sleep(2);//in miliseconds
  System.out.println("Test passed in the corret amount of time ");
}
}

    
    
    
    
    
    
    
    
    
    
    

   
    
}
