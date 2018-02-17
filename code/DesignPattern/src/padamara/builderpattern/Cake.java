package padamara.builderpattern;

public class Cake {
	private final double sugar;//cup
	private final double butter;//cup
	private final double milk;//cup
	private final int cherry;
	
	public static class CakeBuilder{
		private double sugar;
		private double butter;
		private double milk;
		private int cherry;
		
		//builder methods for setting property
		
		public CakeBuilder sugar(double cup) {
			this.sugar=cup;
			return this;
		}
		
		public CakeBuilder butter(double cup) {
			this.butter=cup;
			return this;
		}
		
		public CakeBuilder milk(double cup) {
			this.milk=cup;
			return this;
		}
		
		public CakeBuilder cherry(int number) {
			this.cherry=number;
			return this;
		}
		
		//return fully build objects
		public Cake build() {
			return new Cake(this);
		}
	}
	private Cake(CakeBuilder builder) {
		this.sugar=builder.sugar;
		this.butter=builder.butter;
		this.milk=builder.milk;
		this.cherry=builder.cherry;		
	}
	
	public String toString() {
		return "Cake [sugar="+sugar+", butter="+butter+",milk"+milk+", cherry="+cherry+"]";
	}
	
	

}
