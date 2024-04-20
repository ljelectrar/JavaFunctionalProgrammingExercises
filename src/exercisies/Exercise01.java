package exercisies;

import java.util.List;

public class Exercise01 {

	public static void main(String[] args) {
		
		List<Integer> listInteger = List.of(1,2,3,4,5,6,7,8,9);
		List<String> ListOfCourses = List.of("Spring", "Aws", "Net" ,"Java", "Rust", "React", "Spring Security", "Spring Framework", "Angular");

		System.out.println("Even Numbers: ");
		printOnlyEvenNumbers(listInteger);
		
		System.out.println("\nOdd Numbers Squared: ");
		printOnlyOddNumbersSquared(listInteger);
		
		System.out.println("\nOdd Numbers: ");
		printOnlyOddNumbers(listInteger);
		
		System.out.println("\nEven Numbers cubed: ");
		printOnlyOddNumbersCubed(listInteger);
		
		System.out.println("\nPrinting courses: ");
		printCoursesIndividually(ListOfCourses);
		
		System.out.println("\nPrinting courses containing the word Spring: ");
		printOnlyCoursesContainingSpringWord(ListOfCourses);
		
		System.out.println("\nPrinting courses containing at least four letters: ");
		printCoursesthatcontainAtLeastFourLetters(ListOfCourses);
		
	}

	// print only even numbers from a list
	private static void printOnlyEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 == 0)
		.forEach(System.out::println);
	}
	
	// print only odd numbers from a list
	private static void printOnlyOddNumbers(List<Integer> numbers) {
		numbers
		.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
	
	// print only odd numbers squared
	private static void printOnlyOddNumbersSquared(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number)
		.forEach(System.out::println);
	}
	
	// print only even numbers cubed
	private static void printOnlyOddNumbersCubed(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 == 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);
	}

	
	// print all courses individually
	// List<String> list = List.of("Spring", "Java", "React", "Angular", "Aws"..)
	private static void printCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}
	
	//print courses containing the word "Spring"
	private static void printOnlyCoursesContainingSpringWord(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}
	
	//print courses whose names has at least 4 letters
	private static void printCoursesthatcontainAtLeastFourLetters(List<String> courses) {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
	}
}
