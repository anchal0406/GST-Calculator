//Child class for final selling price of cosmetics
class FinalSellingPriceCosmetics extends GSTCalculator
{
	void finalSellingPriceCosmetics(int unit,double initialPriceUnit)
   	{
        	//Stores cosmetics gst value of base class
		double gst = super.gstCosmetics;
		System.out.println(gst);
		double finalPriceCosmetics = (initialPriceUnit+gst)*unit;
		System.out.println(finalPriceCosmetics);
    	}
}
