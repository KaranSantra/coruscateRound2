/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author karansantra
 */
public class SecondTask {

    public static void main(String[] args) {

        int noOfTestcases = 0;
        boolean testCaseConstraint = false;
        Scanner sc = new Scanner(System.in);
        Collection<TrainSeat> testCases = new ArrayList<TrainSeat>();
        do {
            noOfTestcases = sc.nextInt();
            if (!(noOfTestcases >= 1 && noOfTestcases <= 105)) {
                System.out.println("Error: Testcases should between 1 to 105");
                testCaseConstraint = true;
            } else {
                testCaseConstraint = false;
                for (int i = 0; i < noOfTestcases; i++) {
                    boolean seatNoConstraint = false;
                    do {
                        int seatNumber = sc.nextInt();
                        if (!(seatNumber >= 1 && seatNumber <= 108)) {
                            System.out.println("Error: Seat Number of passager should between 1 to 108");
                            seatNoConstraint = true;
                        } else {
                            seatNoConstraint = false;
                        }

                        if (seatNoConstraint == false) {
                            TrainSeat testcase = new TrainSeat();
                            testcase.setPassengerSeatNumber(seatNumber);
                            testCases.add(testcase);
                        }
                    } while (seatNoConstraint);

                }
            }

        } while (testCaseConstraint);

        for (TrainSeat tc : testCases) {
            tc.calculateFrontSeatNoAndSeatType();
            System.out.println(tc.getSeatNumberFacingPassenger()+ " "+tc.getSeatType());
        }
    }
}
