package padamara.factorypattern;

public class Lenovo implements IMobile {

	@Override
	public void cost() {
		System.out.println("Lenovo cost start with 10000Rs");
		
	}

	@Override
	public void pictureQuality() {
		System.out.println("Lenovo picture quality start with 10MP");
		
	}

	@Override
	public void batteryPower() {
		System.out.println("Lenovo battery power start with 2400 MAh");
		
	}
	
}
