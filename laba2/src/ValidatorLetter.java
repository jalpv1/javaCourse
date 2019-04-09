import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorLetter implements Validator {
    private  boolean flag = false;

    public String getCheckString() {
        return checkString;
    }

    public void setCheckString(String checkString) {
        this.checkString = checkString;
    }

    String checkString;

    public void   isValid() throws StringExeption {
        Pattern pattern;
        pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(checkString);
        while (matcher.find()) {
            flag = true;
            throw new StringExeption();
            //System.out.println(LETTER_IN_NUMBER);
        }
    }
}
