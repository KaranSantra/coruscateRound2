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

    public void findRowOfSeatNumber() {
        int i;
        for (i = 0; i < totalNoOfRows; i++) {
            if (passengerSeatNumber >= 6 * i + 1 && passengerSeatNumber <= 6 * i + 6) {
                int rowStart = 6 * i + 1, rowEnd = 6 * i + 6;
                int j, columnNo = 0;
                for (j = rowStart; j <= rowEnd; j++) {
                    columnNo++;
                    if (passengerSeatNumber == j) {
                        int row = i + 1;

                        calculateFrontSeat(row, columnNo);
                    }
                }
            }
        }
    }

    private void calculateFrontSeat(int row, int columnNo) {
        int addOrSubtractableValue = getAddOrSubtractableValue(columnNo, row);
        System.out.println("add or sub = " + row);
        if (row % 2 != 0) {//for odd rows
            seatNumberFacingPassenger = passengerSeatNumber + addOrSubtractableValue;
        } else {
            seatNumberFacingPassenger = passengerSeatNumber - addOrSubtractableValue;
        }
        System.out.println(seatNumberFacingPassenger);
    }

    private int getAddOrSubtractableValue(int columnNo, int row) {
        if (row % 2 != 0) {
            return 13 - (2 * columnNo);
        }else{
             return 13 - (2 * (7-columnNo));
        }
    }

}
