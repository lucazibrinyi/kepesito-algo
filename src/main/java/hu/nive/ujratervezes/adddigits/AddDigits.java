package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.length() == 0) {
            return -1;
        
        } else {
            for (char c : input.replaceAll("\\D", "").toCharArray()) {
                int digit = c - '0';
                result += digit;

            }
            return result;
        }

    }
}
