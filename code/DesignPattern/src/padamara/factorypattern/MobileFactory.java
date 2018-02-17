package padamara.factorypattern;

public class MobileFactory {

	public MobileFactory() {
		
	}
	
	IMobile createMobile(String type) {
		IMobile mob=null;
		if("len".equalsIgnoreCase(type)) {
			mob=new Lenovo();
			System.out.println("Lenovo Created!");
		}
		else if("sam".equalsIgnoreCase(type)) {
			mob=new Samsung();
			System.out.println("Samsung Created!");
		}
		return mob;
	}
	
}
