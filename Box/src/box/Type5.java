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
public class Type5 extends ReinfBase{
    public Type5(double inHeight, double inWidth, double inLength, boolean inSealed, String inColour1, String inColour2, boolean inReinfBase){
    super(inHeight, inWidth, inLength, inSealed, inColour1, inColour2, inReinfBase);
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
        //Type 3 box always has 2 colours, therefore we add 15% of the base cost to the final cost.
        cost+=(baseCost*0.15);
        //Type 5 always has Reinforced Bottoms, therefore we add 13% of the base cost to the final cost.
        cost+=(baseCost*0.13);
        //Type 5 always has Reinforced Corners, therefore we add 12% of the base cost to the final cost.
        cost+=(baseCost*0.12);
        return cost;  
    }
}
