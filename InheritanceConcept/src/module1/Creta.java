package module1;

public class Creta extends Hyundai {

	public static void main(String[] args) {

		Creta.engineCapaicity();
		// engineCapaicity(); Directly also we can access without class name . method name 
		
		Creta c = new Creta();
		c.suvFeatures();
		
		// Accessing Hyundai class methods using creat's object and class name 
		c.startCar();
		c.stopCar();
		Creta.commonHyundaifeatures();
		
		
		/*
		Hyundai h = new Hyundai();
		h.startCar();
		h.stopCar();
		Hyundai.commonHyundaifeatures();
		*/
	
	
	
	}
	
	public static void engineCapaicity()
	{
		System.out.println("Engine Capacity");
	}
	
	public void suvFeatures()
	{
		System.out.println("SUV Features");
	}

}
