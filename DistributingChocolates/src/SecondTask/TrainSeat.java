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
public class TrainSeat {

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
    
    

    public void calculateFrontSeatNoAndSeatType() {
        int i;
        for (i = 0; i < totalNoOfRows; i++) {
            if (passengerSeatNumber >= 6 * i + 1 && passengerSeatNumber <= 6 * i + 6) {
                int rowStart = 6 * i + 1, rowEnd = 6 * i + 6;
                int j,columnNo=0;
                for (j = rowStart; j <= rowEnd; j++) {
                    columnNo++;
                    if (passengerSeatNumber == j) {
                        int row = i + 1;                        
                        findRowOfSeatNumber(row, columnNo);
                        findSeatType(columnNo);
                    }
                }
            }
        }
    }

    private void findRowOfSeatNumber(int row,int columnNo) {
        
        int addOrSubtractableValue = getAddOrSubtractableValue(columnNo, row);
        
        if (row % 2 != 0) {//for odd rows
            seatNumberFacingPassenger = passengerSeatNumber + addOrSubtractableValue;
        } else {// for even rows
            seatNumberFacingPassenger = passengerSeatNumber - addOrSubtractableValue;
        }
       
    }

    private int getAddOrSubtractableValue(int columnNo, int row) {
        if (row % 2 != 0) {
            return 13 - (2 * columnNo);
        }else{
             return 13 - (2 * (7-columnNo));
        }
    }
    
    public  void findSeatType(int columnNo){
        
        switch(columnNo){
            case 1:
            case 6:
                setSeatType("WS");
                break;
            case 2:
            case 5:
                setSeatType("MS");
                break;
            case 3:
            case 4:
                setSeatType("AS");
                break;                
        }
    }

}
