package homeworkcurs15;

class RecursiveMethods {

    public int sumFirstNIntegers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumFirstNIntegers(n-1);
        }
    }

    public int sumFirstNEvenIntegers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 2*n + sumFirstNEvenIntegers(n-1);
        }
    }

    public boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        } else {
            return isPalindrome(word.substring(1, word.length()-1));
        }
    }

    public String recursiveStringReverse(String string) {
        if (string.length() == 0) {
            return string;
        } else {
            return recursiveStringReverse(string.substring(1)) + string.charAt(0);
        }
    }

    public boolean recursiveCheckFirstLast(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        } else {
            return recursiveCheckFirstLast(word.substring(1, word.length()-1));
        }
    }

    public int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n%10 + sumOfDigits(n/10);
        }
    }

    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

