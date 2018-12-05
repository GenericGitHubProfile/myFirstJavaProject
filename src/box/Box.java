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
public abstract class Box {
    //creates variables accessible from entire package
    //might change to private and create get and set methods.
    protected int grade = 1;
    protected boolean sealable = false, colour1 = false, colour2 = false, reinfBase = false, reinfCor = false;
    protected double height = 0, width = 0, length = 0, cost = 0;
    protected double[] prices = {0.55, 0.65, 0.82, 0.98, 1.5};
    /**
     * @param args the command line arguments
     * @param inHeight sets height of the box
     * @param inWidth sets the width of the box
     * @param inLength sets the length of the box
     * @param inSealed decides whether the box is sealed or not
     * @param inColour1 does the box have the first colour
     * @param inColour2 does the box have the second colour
     * @param inReinfBase does the box have a Reinforced Base
     * @param inReinfCor does the box have Reinforced Corners
     */
    //super(inHeight, inWidth, inLength, inSealed, inColour1, inColour2, inReinfBase);
    public Box(){}
    //The base box class, gets in all the basic parameters.
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
    }
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed, boolean inColour1){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
        colour1 = inColour1;
    }
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed, boolean inColour1, boolean inColour2){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
        colour1 = inColour1;
        colour2 = inColour2;
    }
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed, boolean inColour1, boolean inColour2, boolean inReinfBase){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
        colour1 = inColour1;
        colour2 = inColour2;
        reinfBase = inReinfBase;
    }
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed, boolean inColour1, boolean inColour2, boolean inReinfBase, boolean inReinfCor){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
        colour1 = inColour1;
        colour2 = inColour2;
        reinfBase = inReinfBase;
        reinfCor = inReinfCor;
    }
    public abstract double calculateCost();
}
