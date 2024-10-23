//Adrian Alamilla-Vega
//CSCI U200 Lab5
//February 20, 2023
//This code converts a given phrase into Pig Latin, as such The name is xyzzy is ehtay amenay is yxyzzay. Introduces the use of functions.
public class Lab5 {
	public static void main(String[] args) {
		System.out.println("Enter a phrase (leave blank to end):");
		String input = System.console().readLine();
		while (!input.isEmpty()) {
			sentenceConverter(input);
			System.out.println(sentenceConverter(input));
			System.out.println("Enter a phrase (leave blank to end):");
			input = System.console().readLine();
		}
	}

	/****************************************
	 *The given a phrase(a string) is deconstructed word by word, to be sent to the pig latin word converter.
	 * and is then reconstructed with its Pig Latin form to be sent to main method.
	 * @param input The given string to being deconstructed.
	 * @return input The given phrase changed into its pig latin form.
	 ****************************************/
	public static String sentenceConverter(String input) {
		String[] words = input.split(" ");
		for (int j = 0; j < words.length; j++) {
			words[j] = wordConverter(words[j]);
		}
		input = String.join(" ", words);
		return input;
	}

	/****************************************
	 *Each individual word is from the given phrase is shifted to adhere to Pig Latin, example Hello is Elloay.
	 * Also adds the corrects capitalization, if included, and punctuation of words.
	 * @param word The string contains the single word of phrase.
	 * @return word The altered word in pig latin.
	 ****************************************/
	public static String wordConverter(String word) {
		boolean isPunctuated = false;
		String punctuation = "";
		if (word.substring(word.length() - 1).equalsIgnoreCase(".") ||
				word.substring(word.length() - 1).equalsIgnoreCase("!") ||
				word.substring(word.length() - 1).equalsIgnoreCase("?")) {
			isPunctuated = true;
			punctuation = word.substring(word.length() - 1);
			word = word.substring(0, word.length() - 1);
		}
		char firstChar = word.charAt(0);
		if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') {
			if (isPunctuated) {
				word += punctuation;
			}
			return word;
		}
		int counter = 1;
		char secondChar = word.charAt(1);
		while (firstChar != 'a' && firstChar != 'e' && firstChar != 'i' && firstChar != 'o' && firstChar != 'u' && firstChar != 'A' && firstChar != 'E' && firstChar != 'I' && firstChar != 'O' && firstChar != 'U') {
			if(counter==word.length()) {
				break;
			}
			if ((firstChar >= 'A' && firstChar <= 'Z') && (secondChar >= 'a' && secondChar <= 'z')) {
				word = word.toUpperCase().substring(1, 2) + word.substring(2) + word.toLowerCase().charAt(0);
				firstChar = word.charAt(0);
				counter++;
			} else if ((firstChar >= 'A' && firstChar <= 'Z') && (secondChar >= 'A' && secondChar <= 'Z')) {
				word = word.substring(1) + word.charAt(0);
				firstChar = word.charAt(0);
				counter++;
			} else {
				word = word.substring(1) + word.charAt(0);
				firstChar = word.charAt(0);
				counter++;
			}
		}
		if ((firstChar >= 'A' && firstChar <= 'Z') && (secondChar >= 'a' && secondChar <= 'z')) {
			word = word + "ay";
		} else if ((firstChar >= 'A' && firstChar <= 'Z') && (secondChar >= 'A' && secondChar <= 'Z')) {
			word = word + "AY";
		} else {
			word = word + "ay";
		}
		if (isPunctuated)
			word += punctuation;

		return word;
	}
}
