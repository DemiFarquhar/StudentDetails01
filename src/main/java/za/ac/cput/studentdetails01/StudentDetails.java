/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentdetails01;

/**
 *
 * @author Breyton Ernstzen - 217203027 (Group Lead)
 */
public class StudentDetails {
        private String StudentName,Majorsubject,Minorsubject;
    private double Averageamount;
    double getAverageamount;

    public String getStudentName() {
        return "John";
    }
   
    public String getMajorsubject() {
        return "Maths";
    }

    public void setMajorsubject(String Majorsubject) {
        this.Majorsubject = Majorsubject;
    }

    public String getMinorsubject() {
        return "Linux";
    }

    public void setMinorsubject(String Minorsubject) {
        this.Minorsubject = Minorsubject;
    }

    public double getAverageamount() {
        return 60;
    }

    public void setAverageamount(double Averageamount) {
        this.Averageamount = Averageamount;
    }

    @Override
    public String toString() {
        return "Report{" + "studentName=" + StudentName + ", Majorsubject=" + Majorsubject + ", Minorsubject=" + Minorsubject + ", Averageamount=" + Averageamount + '}';
    }
}
