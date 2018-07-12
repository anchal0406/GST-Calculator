import java.io.*;
import java.util.*;
//Main class
public class GSTFinalSellingPrice
{
	public static void main(String args[])
	{
        //Array to store different products
        String[] foodGrains = {"Rice","Wheat","Dal"};
        String[] furniture = {"Table","Sofa","Chair"};
        String[] electronics = {"Mobile","TV","Tablet"};
        String[] cosmetics = {"Cream","Perfume","Lotion"};
		Scanner sc=new Scanner(System.in);
		FinalSellingPriceFoodGrains foodGriansObject = new FinalSellingPriceFoodGrains();
        FinalSellingPriceFurniture furnitureObject = new FinalSellingPriceFurniture();
        FinalSellingPriceElectronics electronicsObject = new FinalSellingPriceElectronics();
        FinalSellingPriceCosmetics cosmeticsObject = new FinalSellingPriceCosmetics();
        
		int unit = sc.nextInt();
		String commodity = sc.next();
		double initialPriceUnit = sc.nextDouble();
        
        //Compares commodity value with food grains array.
        for (String item:foodGrains ) {
            if ( item.equals(commodity)) {
				foodGriansObject.gstCalculatorFoodGrains(initialPriceUnit);
				foodGriansObject.finalSellingPriceFoodGrains(unit, initialPriceUnit);
            }
        }
        //Compares commodity value with furniture array.
         for (String item:furniture ) {
            if ( item.equals(commodity)) {
                furnitureObject.gstCalculatorFurniture(initialPriceUnit);
			    furnitureObject.finalSellingPriceFurniture(unit, initialPriceUnit);
            }
        }
        //Compares commodity value with electronics array.
        for (String item:electronics ) {
            if ( item.equals(commodity)) {
                electronicsObject.gstCalculatorElectronics(initialPriceUnit);
			    electronicsObject.finalSellingPriceElectronics(unit, initialPriceUnit);
            }
        }
        //Compares commodity value with cosmetics array.
        for (String item:cosmetics ) {
            if ( item.equals(commodity)) {
                cosmeticsObject.gstCalculatorCosmetics(initialPriceUnit);
			    cosmeticsObject.finalSellingPriceCosmetics(unit,initialPriceUnit);
            }
        }
	} 
}