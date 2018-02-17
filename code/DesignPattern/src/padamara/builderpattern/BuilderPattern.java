package padamara.builderpattern;

public class BuilderPattern {

	public static void main(String[] args) {
		//Creating object using Builder pattern in java
		Cake whiteCake=new Cake.CakeBuilder().sugar(1).butter(0.5).milk(0.5).build();
		Cake HoneyCake=new Cake.CakeBuilder().sugar(1).butter(0.75).milk(0.35).build();
		Cake ChocolateCake=new Cake.CakeBuilder().sugar(1).butter(0.25).milk(0.75).build();
		
		//Cake is ready to eat :)
		System.out.println(whiteCake);
		System.out.println(HoneyCake);
		System.out.println(ChocolateCake);

	}

}
