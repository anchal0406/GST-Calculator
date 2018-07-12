//Child class for final selling price of electronics
class FinalSellingPriceElectronics extends GSTCalculator
{
	void finalSellingPriceElectronics(int unit,double initialPriceUnit)
    {
        //Stores electronics gst value of base class
		double gst = super.gstElectronics;
		System.out.println(gst);
		double finalPriceElectronics = (initialPriceUnit+gst)*unit;
		System.out.println(finalPriceElectronics);
	}
}