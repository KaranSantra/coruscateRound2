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
public class TrainSeatingArrangement {

    private final int totalNoOfRows = 18;
    private int passengerSeatNumber;
    private int seatNumberFacingPassenger;
    private String seatType;

    public int getPassengerSeatNumber() {
        return passengerSeatNumber;
    }

    public void setPassengerSeatNumber(int passengerSeatNumber) {
        this.passengerSeatNumber = passengerSeatNumber;
    }

    public int getSeatNumberFacingPassenger() {
        return seatNumberFacingPassenger;
    }

    public void setSeatNumberFacingPassenger(int seatNumberFacingPassenger) {
        this.seatNumberFacingPassenger = seatNumberFacingPassenger;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    
}
