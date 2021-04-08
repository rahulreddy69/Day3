package day3;
import java.util.Scanner;


public class DogApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		Dog d1 = new Dog();
		d1.setName("Jimmy");
		d1.setAge(2);
		d1.setWeight(20);
		while(status)
		{
			System.out.println("Enter your choice");
			int n = sc.nextInt();
			switch(n){
				case 1:
					d1.doFeedAnimal();
					break;
				case 2:
					d1.playGames();
					break;
				default:
					System.out.println("Exit the game");
					status = false;
					
			}
		}
		sc.close();
	}

}
