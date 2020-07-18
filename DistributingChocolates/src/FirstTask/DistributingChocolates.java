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
        
        //This equation finds the first term (k) of a sum of arithmetic progression of k,k+1...,k+n 
        double k = (((2 * noOfChocolates) / noOfStudents) + 1 - noOfStudents) / 2.0;
        int ceilingSum = 0, floorSum = 0;
        int maxValueOfK = (int) Math.ceil(k);
        int minValueOfK = (int) Math.floor(k);

        for (int i = 0; i < 3; i++) {
            ceilingSum += maxValueOfK + i;
            floorSum += minValueOfK + i;
        }
        
        System.out.println("k is " + k);
        System.out.println(ceilingSum + "<<<< ceiling Sum ------ floorSum >>>>>>>>>" + floorSum);
    }

}
