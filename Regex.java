import java.util.regex.Pattern;

public class Regex {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private static final Pattern DATE_PATTERN = Pattern.compile("^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$");
    private static final Pattern URL_PATTERN = Pattern.compile("[-a-zA-Z0-9@:%_\\+.~#?&//=]{2,256}\\.[a-z]{2,4}\\b(\\/[-a-zA-Z0-9@:%_\\+.~#?&//=]*)?");
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("[0-9]{5}(-[0-9]{4})?");
    private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile("(\\d{4}[-. ]?){4}|\\d{4}[-. ]?\\d{6}[-. ]?\\d{5}");
    private static final Pattern JAVA_IDENTIFIER_PATTERN = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
    private static final Pattern TIME_PATTERN = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9])?");
    private static final Pattern HEX_COLOR_PATTERN = Pattern.compile("^#?([a-f0-9]{6}|[a-f0-9]{3})$");

    public static void main(String[] args) {
        System.out.println("Valid email address: " + validEmail("palmersola@yahoo.com"));
        System.out.println("Valid phone number: " + validPhoneNumber("(612) 243-4567"));
        System.out.println("Valid date mm/dd/yyyy: " + validDate("05/03/1998"));
        System.out.println("Valid URL: " + validUrl("www.facebook.com"));
        System.out.println("Valid credit card number: " + validCreditCard("5432-7634-9234-3843"));
        System.out.println("Valid zipcode: " + validZipCode("55112-4632"));
        System.out.println("Valid java: " + validJava("$javaTest$"));
        System.out.println("Valid hex color: " + validHex("#fff987"));
        System.out.println("Valid time: " + validTime("2:53"));
    }
    public static boolean validEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean validPhoneNumber(String number) {
        return PHONE_NUMBER_PATTERN.matcher(number).matches();
    }
    public static boolean validDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
    public static boolean validUrl(String url) {
        return URL_PATTERN.matcher(url).matches();
    }
    public static boolean validCreditCard(String card) {
        return CREDIT_CARD_PATTERN.matcher(card).matches();
    }
    public static boolean validZipCode(String zipcode) {
        return ZIP_CODE_PATTERN.matcher(zipcode).matches();
    }
    public static boolean validJava(String java) {
        return JAVA_IDENTIFIER_PATTERN.matcher(java).matches();
    }
    public static boolean validHex(String hex){
        return HEX_COLOR_PATTERN.matcher(hex).matches();
    }
    public static boolean validTime(String time){
        return TIME_PATTERN.matcher(time).matches();
    }
}