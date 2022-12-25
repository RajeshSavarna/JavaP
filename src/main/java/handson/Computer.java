package handson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Computer {

	private String brand;
	private Double price;

	public Computer(String brand, Double price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}

	public void applyDiscount(Double discount){
		this.price *= discount;
	}

	public static void main (String[] args) {


		List<Computer> computers = new ArrayList<>();
		computers.add(new Computer("Lenovo Thinkpad", 3000.00));
		computers.add(new Computer("Dell Inspiron", 1400.00));
		computers.add(new Computer("Dell Optiplex", 900.00));
		computers.add(new Computer("HP Victus ", 1500.00));
		computers.add(new Computer("Dell XPS 15", 2100.00));
		computers.add(new Computer("Dell Alienware", 3500.00));
		computers.add(new Computer("Acer Swift", 600.00));

		//1. Using Stream API, return the least priced Dell computer from the list: 
		Computer computer = computers.stream().filter(a -> a.getBrand().contains("Dell")).min(Comparator.comparing(a -> a.getPrice())).get();
		System.out.println(computer.toString());

	}

}