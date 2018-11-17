/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author up863207
 */
public class colour2 extends colour1{
    protected String colour2 = "";
    //Part of the class hierarchy which adds a second colour for Type 3 and above boxes.
    /**
    * @param inColour2 enters the second colour, for Boxes of Type 3 and above.
    */
    public colour2(double inHeight, double inWidth, double inLength, boolean inSealed, String inColour1, String inColour2){
        super(inHeight, inWidth, inLength, inSealed, inColour1);
        colour2 = inColour2;
    }
}
