/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondTask;

/**
 *
 * @author karansantra
 */
public class SecondTask {

    public static void main(String[] args) {
        TrainSeatingArrangement seatingArrangement = new TrainSeatingArrangement();
        for (int i = 18; i >= 13; i--) {
            seatingArrangement.setPassengerSeatNumber(i);
            seatingArrangement.findRowOfSeatNumber();

        }

    }
}
