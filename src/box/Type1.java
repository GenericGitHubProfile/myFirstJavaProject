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
public class Type1 extends Box{
    public Type1(double inHeight, double inWidth, double inLength, boolean inSealed){
        super(inHeight, inWidth, inLength, inSealed);
    }
    public double calculateCost(){
        //Cost calculated by square metre.
        //Therefore does 2 times each side, to get the overall surface area.
        //Then multiplied by the cost of each grade to get the overall cost.
        cost = (2*(height*width)+2*(height+length)+2*(width*height))*prices[grade+1];
        double baseCost = cost;
        if(sealable){
            cost+=(baseCost*0.1);
        }
        return cost;
    }
}
