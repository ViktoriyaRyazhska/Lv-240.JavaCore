
public class Car {
	private String type;
	private int year;
	private double engine;
	public Car(String type, int year, double engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}
	public Car() {
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	
}
