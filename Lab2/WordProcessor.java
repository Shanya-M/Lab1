public class WordProcessor implements Counter {

    // Text attribute with getters and setters
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Implementation of countWords method
    @Override
    public int countWords(String sentence) {
        // Use the 'text' attribute if the sentence is null
        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null || sentence.isEmpty()) {
            return 0; // Return 0 if sentence is null or empty
        }

        // Split the sentence by spaces and count the words
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Implementation of countLetters method
    @Override
    public int countLetters(String sentence) {
        // Use the 'text' attribute if the sentence is null
        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null) {
            return 0; // Return 0 if sentence is null
        }

        // Iterate through the sentence to count letters
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    // Implementation of getLength method
    @Override
    public int getLength(String sentence) {
        // Use the 'text' attribute if the sentence is null
        if (sentence == null) {
            sentence = text;
        }

        if (sentence == null) {
            return 0; // Return 0 if sentence is null
        }

        // Return the length of the sentence (including spaces)
        return sentence.length();
    }
}

