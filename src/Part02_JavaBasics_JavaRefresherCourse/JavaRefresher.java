package Part02_JavaBasics_JavaRefresherCourse;

public class JavaRefresher {

    public static String vowelOnly(String input) {
        String vowels = "aeiou";
        StringBuilder resultOfVowels = new StringBuilder();
        for(char character : input.toCharArray())
        {
            if(vowels.contains(String.valueOf(character))){
                resultOfVowels.append(character);
            }
        }
        return resultOfVowels.toString();
    }
}
