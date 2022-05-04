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
        }
        return nthFinal;
    }
}
