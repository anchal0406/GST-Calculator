//Child class for final selling price of food grains
class FinalSellingPriceFoodGrains extends GSTCalculator
{
	void finalSellingPriceFoodGrains(int unit,double initialPriceUnit)
    {
        //Stores food grains gst value of base class 
	double gst = super.gstFoodGrains; 
	System.out.println(gst);
	double finalPriceFoodGrains = (initialPriceUnit+gst)*unit;
	System.out.println(finalPriceFoodGrains);
    }
}
