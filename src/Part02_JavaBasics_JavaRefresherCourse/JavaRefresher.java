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

    public static int findTarget (/*int[] arr, int target*/) {
        //Using Binary Search
        //To Be Enhanced Later
        int[] arr = {1,2, 3, 4, 6};
        int target = 1;
        int left = 0;
        int right = arr.length-1;
        while (left+1 < right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == target)
            {
                return mid;
            }else if (arr[mid] > target)
            {
                right = mid;
            }else{
                left = mid;
            }
            if (arr[left] == target)  {
                return left;
            }
            if (arr[right] == target) {
                return right;
            }
        }
        return -1;

    }
}
