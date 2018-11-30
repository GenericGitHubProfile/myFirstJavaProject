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
public abstract class colour1 extends Box{
    protected String colour1 = "";
    //Part of the class hierarchy which adds a colour to the box, for type2 and above.
    /**
     * @param inColour1 enters the first colour, for Boxes of Type 2 and above.
     */
    public colour1(double inHeight, double inWidth, double inLength, boolean inSealed, String inColour1){
        super(inHeight, inWidth, inLength, inSealed);
        colour1 = inColour1;
    }
}
