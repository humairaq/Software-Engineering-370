package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

    private String cString;

    @Override
    public String getString() {
        if (this.cString.isEmpty()) {
            return null;
        } else {
            return this.cString;
        }
    }


    @Override
    public void setString(String string) {
        this.cString = string;
    }


    @Override
    public int countNumbers() throws NullPointerException {
        int numOfNums = 0;
        int count;
        if (this.cString == null) {
            throw new NullPointerException(" the current string is empty");
        }
        for (int i = 0; i < this.cString.length(); i++) {
            char c = this.cString.charAt(i);
            if (Character.isDigit(c)) {

                count = i;
                while (Character.isDigit(cString.charAt(count))) {
                    count++;
                    if (count >= cString.length())
                        break;
                }
                i = count;
                numOfNums++;
            }

        }
        return numOfNums;


    }

    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        StringBuilder nthCharacters = new StringBuilder();

        if (n <= 0) {
            throw new IllegalArgumentException();
        } else if (this.cString == null) {
            throw new NullPointerException();
        } else {
            if (n > this.cString.length()) {
                return "";
            } else {
                if (startFromEnd) {
                    for (int i = this.cString.length() - n; i >= 0; i -= n) {
                        nthCharacters.insert(0, this.cString.charAt(i));
                    }
                } else {
                    for (int i = n - 1; i < this.cString.length(); i += n) {
                        nthCharacters.append(this.cString.charAt(i));
                    }
                }
                return nthCharacters.toString();
            }
        }
    }


    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        if (startPosition > endPosition) {
            throw new IllegalArgumentException();
        } else if ((startPosition <= endPosition) && ((startPosition < 1 || endPosition > this.cString.length()))) {
            throw new MyIndexOutOfBoundsException();

        } else if ((startPosition <= endPosition) && (startPosition > 0 && endPosition > 0) && this.cString == null) {
            throw new NullPointerException();
        } else {

            StringBuilder digitToName = new StringBuilder();
            for (int i = 0; i < this.cString.length(); i++) {
                if (Character.isDigit(cString.charAt(i)) && i >= startPosition - 1 && i <= endPosition - 1) {
                    switch (cString.charAt(i)) {
                        case '0' -> digitToName.append("Zero");
                        case '1' -> digitToName.append("One");
                        case '2' -> digitToName.append("Two");
                        case '3' -> digitToName.append("Three");
                        case '4' -> digitToName.append("Four");
                        case '5' -> digitToName.append("Five");
                        case '6' -> digitToName.append("Six");
                        case '7' -> digitToName.append("Seven");
                        case '8' -> digitToName.append("Eight");
                        case '9' -> digitToName.append("Nine");
                    }
                } else {
                    digitToName.append(this.cString.charAt(i));
                }
            }
            this.cString = digitToName.toString();
        }
    }
}





