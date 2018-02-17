package padamara.factorypattern;

public class FactoryTest {

	public static void main(String[] args) {
		MobileFactory mobileFactory=new MobileFactory();
		
		Lenovo lenovo= (Lenovo)mobileFactory.createMobile("len");
		lenovo.batteryPower();
		lenovo.pictureQuality();
		
		Samsung samsung= (Samsung)mobileFactory.createMobile("sam");
		samsung.batteryPower();
		samsung.pictureQuality();
		
	}

}
