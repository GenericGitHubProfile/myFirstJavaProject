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
public class Box {
    protected int grade;
    protected boolean sealable;
    protected double cost;
    protected double height, width, length;
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
    public double calculateCost(){
        double[] prices = {0.55, 0.65, 0.82, 0.98, 1.5};
        //Cost calculated by square metre.
        //Therefore does 2 times each side, to get the overall surface area.
        //Then multiplied by the cost of each grade to get the overall cost.
        cost = (2*(height*width)+2*(height+length)+2*(width*height))*prices[grade+1];
        if(sealable){
            //Sealable top adds 10% to the costs
            cost*=1.1;
        }
        return cost;
    }
}
