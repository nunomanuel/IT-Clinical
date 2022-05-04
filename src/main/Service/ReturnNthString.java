public class ReturnNthString {

    public String returnString(String nth, int n) {
        int counter = 0;
        String nthSaved = "";
        String nthFinal = "";
        String[] nthSplit = nth.split("(?!^)");

        if (n > nth.length() || n < 0) {
            return " ";
        }
        for (String s : nthSplit) {
            if (counter >= n) {
                counter = 0;
            }
            nthSaved = s;
            counter++;
            if (Character.isUpperCase(nthSaved.charAt(0)) && counter == n) {
                nthFinal += nthSaved;
            }
            if(!Character.isUpperCase(nthSaved.charAt(0)) && !Character.isLowerCase(nthSaved.charAt(0))) {
                nthFinal += nthSaved;
            }
        }
        return nthFinal;
    }

    public String countCharacter(String nthFinal,int n) {
        String charReturnNth = returnString(nthFinal,n);

        String countChar = "";
        String charFinal = "";
        String[] countSplit = charReturnNth.split("(?!^)");


        for (String s : countSplit) {
            countChar = s;
            int counter = 0;
            for (String value : countSplit) {
                if (countChar.equals(value)) {
                    counter++;
                }
            }
            if (!charFinal.contains(s)) {
                charFinal += "\n" + s + " " + "=" + " " + counter;
            }
        }
        return charReturnNth + "\n" + charFinal;
    }
}
