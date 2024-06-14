import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Task 1: Convert a list of Strings to uppercase
        Stream<String> namesStream = Stream.of("aBc", "d", "ef");
        List<String> upperCaseNames = namesStream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Task 2: Check whether the Strings in the list are empty and print the list having non-empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "");
        List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("Non-Empty Strings: " + nonEmptyStrings);

        // Task 3: Separate students whose names start with "A"
        List<String> studentNames = new ArrayList<>(Arrays.asList(
            "Alice", "Bob", "Amanda", "John", "Alex", "Mark", 
            "Andrew", "Eve", "Ann", "Brian"
        ));
        
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        
        System.out.println("Students with special gifts: " + specialGiftStudents);

        // Task 4: Calculate age from birthdate
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();
        
        LocalDate birthdate = LocalDate.parse(birthdateInput);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(birthdate, currentDate);
        
        System.out.println("Your age is: " + age.getYears() + " years, " 
                           + age.getMonths() + " months, and " 
                           + age.getDays() + " days.");
    }
}
