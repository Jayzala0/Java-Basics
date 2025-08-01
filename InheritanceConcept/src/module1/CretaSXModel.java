package module1;

public class CretaSXModel extends Creta 
{

	
	public static void main(String[] args) 
	{
		CretaSXModel sx = new CretaSXModel();
		
		sx.autoFeature(); // CretaSXModel class
		sx.suvFeatures(); // Creta class
		sx.startCar(); // Hyundai class
		sx.stopCar(); // Hyundai Class
		
		CretaSXModel.checkTyre(); // CretaSXModel class
		CretaSXModel.engineCapaicity(); // Creta class
		CretaSXModel.commonHyundaifeatures(); // Hyundai Class

	}

	public void autoFeature()
	{
		System.out.println("Auto Feature");
	}
	
	public static void checkTyre()
	{
		System.out.println("Check Tyre");
	}
	
}
