
class CarIdea {
	
	
	@Override
	public String toString() {
		return "Searched car [type = " + type + ", prod year = " + year + ", engine capacity=" + engine + "]";}
	
	public CarIdea(String type, int year, int engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	private String type;
	private int year;
	private int engine;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}

}
