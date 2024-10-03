import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.println("Please enter a sentence:");
        String userInput = scanner.nextLine();

        // Create a WordProcessor object
        WordProcessor wp = new WordProcessor();

        // Call methods passing in the user input
        System.out.println("Word Count: " + wp.countWords(userInput));
        System.out.println("Letter Count: " + wp.countLetters(userInput));
        System.out.println("Sentence Length: " + wp.getLength(userInput));

        // Change the type of the WordProcessor object to Counter (this is allowed)
        Counter counter = wp;
        System.out.println("Using Counter Reference:");
        System.out.println("Word Count: " + counter.countWords(userInput));
        System.out.println("Letter Count: " + counter.countLetters(userInput));
        System.out.println("Sentence Length: " + counter.getLength(userInput));

        // Set fallback text and test with null
        wp.setText("This is the fallback text.");
        System.out.println("Testing with null value:");
        System.out.println("Word Count: " + wp.countWords(null));
        System.out.println("Letter Count: " + wp.countLetters(null));
        System.out.println("Sentence Length: " + wp.getLength(null));
    }
}