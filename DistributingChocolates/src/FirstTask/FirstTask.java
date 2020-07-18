/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author karansantra
 */
public class FirstTask {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int noOfTestcases = 0;
        boolean isTestCaseConstraintSatisfied = false;
        Scanner sc = new Scanner(System.in);
        Collection<DistributingChocolates> testCases = new ArrayList<DistributingChocolates>();

        do {
            noOfTestcases = sc.nextInt();
            //if Testcase constraint not satisfied
            if (!(noOfTestcases >= 1 && noOfTestcases <= 10)) {
                System.out.println("Test cases should between 1 to 10");
                isTestCaseConstraintSatisfied = true;
            } else {
                isTestCaseConstraintSatisfied = false;
                for (int i = 0; i < noOfTestcases; i++) {                    
                    boolean isChocolateCountConstraintSatisfied = false;                   
                    boolean isStudentCountConstraintSatisfied = false;
                    do {
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.nextLine();

                        String[] separateInput = input.split(" ", 2);

                        int noOfChocolates = Integer.parseInt(separateInput[0]);
                        int noOfStudents = Integer.parseInt(separateInput[1]);

                        if (!(noOfChocolates >= 1 && noOfChocolates <= 1000)) {
                            System.out.println("Error : Chocolates should between 1 to 1000");
                            isChocolateCountConstraintSatisfied = true;
                        } else {
                            isChocolateCountConstraintSatisfied = false;
                        }

                        if (!(noOfStudents >= 1 && noOfChocolates <= 100)) {
                            System.out.println("Error: No . of Students should between 1 to 100");
                            isStudentCountConstraintSatisfied = true;
                        } else {
                            isStudentCountConstraintSatisfied = false;
                        }

                        // If Constraints are satisfied then
                        if (isStudentCountConstraintSatisfied == false && isChocolateCountConstraintSatisfied == false) {
                            DistributingChocolates testcase = new DistributingChocolates();
                            testcase.setNoOfChocolates(noOfChocolates);
                            testcase.setNoOfStudents(noOfStudents);                            
                            testCases.add(testcase);
                        }
                    } while (isChocolateCountConstraintSatisfied && isStudentCountConstraintSatisfied);
                }
            }
        } while (isTestCaseConstraintSatisfied);
          
        for(DistributingChocolates distributingChocolate: testCases){
            //printing the result
            distributingChocolate.calculateMinimumNoOfChocolatesLeft();
            System.out.println(distributingChocolate.getMinNoOfChocolateLeft());
        }
    }
}
