/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstTask;

/**
 *
 * @author karansantra
 */
public class DistributingChocolates {

    private int noOfChocolates;
    private int noOfStudents;
    private int minNoOfChocolateLeft;

    public int getNoOfChocolates() {
        return noOfChocolates;
    }

    public void setNoOfChocolates(int noOfChocolates) {
        this.noOfChocolates = noOfChocolates;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getMinNoOfChocolateLeft() {
        return minNoOfChocolateLeft;
    }

    public void setMinNoOfChocolateLeft(int minNoOfChocolateLeft) {
        this.minNoOfChocolateLeft = minNoOfChocolateLeft;
    }

    public void calculateMinimumNoOfChocolatesLeft() {

        // k is the number of chocolate the first student recieves as given in the problem statement
        //consecutive students receive k+1,k+2,...k+n
        int chocolatesLeftFromMaxValueOfK = 0, chocolatesLeftFromMinValueOfK = 0;
        int ceilingSum = 0, floorSum = 0;
        //This equation finds the first term (k) of a sum of arithmetic progression of k,k+1...,k+n 
        //here n = the no of students 
        double k = (((2 * noOfChocolates) / noOfStudents) + 1 - noOfStudents) / 2.0;
        //if value of k is less than one then the solution is not feasible
        if (k >=1.0) {
            //Considering both upper and lower values of k 
            //to determine which value can give minimum chocolates left
            int maxValueOfK = (int) Math.ceil(k);
            int minValueOfK = (int) Math.floor(k);    
            for (int i = 0; i < 3; i++) {
                ceilingSum += maxValueOfK + i;
                floorSum += minValueOfK + i;
            }
            //finding out the chocolates left in both cases of ceiling as well as floor values
            chocolatesLeftFromMaxValueOfK = noOfChocolates - ceilingSum;
            chocolatesLeftFromMinValueOfK = noOfChocolates - floorSum;

            System.out.println("k is " + k);
            System.out.println(ceilingSum + "<<<< ceiling Sum ------ floorSum >>>>>>>>>" + floorSum);
            System.out.println(chocolatesLeftFromMaxValueOfK + "<<<< ceiling left ------ floorLeft >>>>>>>>>" + chocolatesLeftFromMinValueOfK);

            if (chocolatesLeftFromMaxValueOfK < 0) {
                setMinNoOfChocolateLeft(chocolatesLeftFromMinValueOfK);
            } else if (chocolatesLeftFromMinValueOfK < 0) {
                setMinNoOfChocolateLeft(chocolatesLeftFromMaxValueOfK);
            } else if (chocolatesLeftFromMaxValueOfK < chocolatesLeftFromMinValueOfK) {
                setMinNoOfChocolateLeft(chocolatesLeftFromMaxValueOfK);
            } else if (chocolatesLeftFromMaxValueOfK > chocolatesLeftFromMinValueOfK) {
                setMinNoOfChocolateLeft(chocolatesLeftFromMinValueOfK);
            }
        } else {
            //All chocolates are left because distribution is not feasible
            setMinNoOfChocolateLeft(noOfChocolates);
        }
    }

}
