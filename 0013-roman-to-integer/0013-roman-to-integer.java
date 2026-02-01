class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {

                case 'I':

                    if (i == s.length() - 1) {
                        sum += 1;
                        break;
                    }
                    if (s.charAt(i + 1) == 'V') {
                        sum += 4;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'X') {
                        sum += 9;
                        i++;
                        break;
                    }

                    sum += 1;
                    break;

                case 'V':
                    sum += 5;
                    break;

                case 'X':
                    if (i == s.length() - 1) {
                        sum += 10;
                        break;
                    }
                    if (s.charAt(i + 1) == 'L') {
                        sum += 40;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'C') {
                        sum += 90;
                        i++;
                        break;
                    }
                    sum += 10;
                    break;

                case 'L':
                    sum += 50;
                    break;

                case 'C':
                    if (i == s.length() - 1) {
                        sum += 100;
                        break;
                    }
                    if (s.charAt(i + 1) == 'D') {
                        sum += 400;
                        i++;
                        break;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        sum += 900;
                        i++;
                        break;
                    }
                    sum += 100;
                    break;

                case 'D':
                    sum += 500;
                    break;

                case 'M':
                    sum += 1000;
                    break;

                default:
                    break;

            }

        }

        return sum;

    }
}