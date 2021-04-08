package day3;

public class Dog {
	private String name;
	private int age;
	private int weight;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		System.out.println(this);
	}

	// Business method
	public void doFeedAnimal() {
		this.weight += 10;
		System.out.println("Weight of dog is "+weight);
	}

	public void playGames() {

		if (weight >= 2 && weight <= 30) {
			weight -= 1;
			System.out.println("Weight of dog is "+weight);
		} 
		else {
			System.out.println("Dog cannot play");
		}

	}

}
