import java.io.*;

//Base class
class GSTCalculator
{
    static final int food_grains = 0;
    static final int furniture = 5;
    static final int electronics = 18;
    static final int cosmetics = 28;
    double gstFoodGrains, gstFurniture, gstElectronics, gstCosmetics;
    double gstCalculatorFoodGrains(double initialPriceUnit)
    {
	gstFoodGrains = initialPriceUnit * ((double)food_grains/(double)100);
        return gstFoodGrains;
    }
    double gstCalculatorFurniture(double initialPriceUnit)
    {
	gstFurniture = initialPriceUnit * ((double)furniture/(double)100);
        return gstFurniture;
    }
    double gstCalculatorElectronics(double initialPriceUnit)
    {
	gstElectronics = initialPriceUnit * ((double)electronics/(double)100);
        return gstElectronics;
    }
    double gstCalculatorCosmetics(double initialPriceUnit)
    {
	gstCosmetics = initialPriceUnit * ((double)cosmetics/(double)100);
        return gstCosmetics;
    }
}
