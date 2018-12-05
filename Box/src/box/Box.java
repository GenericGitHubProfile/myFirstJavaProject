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
    protected boolean sealable = false;
    protected double cost = 0;
    protected double height = 0, width = 0, length = 0;
    protected double[] prices;
    /**
     * @param args the command line arguments
     * @param inHeight sets height of the box
     * @param inWidth sets the width of the box
     * @param inLength sets the length of the box
     * @param inSealed decides whether the box is sealed or not
     */
    public Box(){}
    //The base box class, gets in all the basic parameters.
    public Box(double inHeight, double inWidth, double inLength, boolean inSealed){
        height = inHeight;
        width = inWidth;
        length = inLength;
        sealable = inSealed;
        double[] prices = {0.55, 0.65, 0.82, 0.98, 1.5};
    }
    public abstract double calculateCost();
}
