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
public class ReinfBase extends colour2{
    /**
     * @param inReinfBase enters whether the box has a reinforced base or not.
     */
    protected boolean reinfBase;
    public ReinfBase(double inHeight, double inWidth, double inLength, boolean inSealed, String inColour1, String inColour2, boolean inReinfBase){
        super(inHeight, inWidth, inLength, inSealed, inColour1, inColour2);
        reinfBase = inReinfBase;
    }
}
