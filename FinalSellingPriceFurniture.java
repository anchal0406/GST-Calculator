//Child class for final selling price of furniture
class FinalSellingPriceFurniture extends GSTCalculator
{
	void finalSellingPriceFurniture(int unit,double initialPriceUnit)
    	{
        	//Stores furniture gst value of base class
		double gst = super.gstFurniture;
		System.out.println(gst);
		double finalPriceFurniture = (initialPriceUnit+gst)*unit;
		System.out.println(finalPriceFurniture);
	}
}
