package web.models;

public class Car {
	private String model;
	private int series;
	private int year;

	public Car(String model, int series, int year) {
		this.model = model;
		this.series = series;
		this.setYear(year);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
