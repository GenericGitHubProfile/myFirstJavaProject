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
public class Type2 extends colour1{
    public Type2(double inHeight, double inWidth, double inLength, boolean inSealed, String inColour1){
        super(inHeight, inWidth, inLength, inSealed, inColour1);
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
        //Type 2 box always has a single colour, therefore we add 12% of the base cost to the final cost.
        cost+=(baseCost*0.12);
        return cost;
    }
}
