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
public class FirstTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        DistributingChocolates distributingChocolates = new DistributingChocolates();
        //Testing by giving input manually from main function
        distributingChocolates.setNoOfChocolates(13);
        distributingChocolates.setNoOfStudents(5);
        distributingChocolates.calculateMinimumNoOfChocolatesLeft();
    }

}
