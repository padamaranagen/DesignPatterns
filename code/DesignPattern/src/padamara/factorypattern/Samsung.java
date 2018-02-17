package padamara.factorypattern;

public class Samsung implements IMobile {

	@Override
	public void cost() {
		System.out.println("Samsung cost start with 5000Rs");

		
	}

	@Override
	public void pictureQuality() {
		System.out.println("Samsung picture quality start with 5MP");

		
	}

	@Override
	public void batteryPower() {
		System.out.println("Samsung batter power start with 2000 MAh");

		
	}

}
