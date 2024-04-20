package exercisies;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("Manga", "Abacate", "Maça", "Banana", "Pêra");

		Predicate<? super String> predicate = fruit -> fruit.startsWith("A");
		
		Optional<String> fruit = fruits.stream().filter(predicate).findFirst();
		
		System.out.println(fruit);
		System.out.println(fruit.isEmpty());
		System.out.println(fruit.isPresent());
		System.out.println(fruit.get());
		
		
	}

}
