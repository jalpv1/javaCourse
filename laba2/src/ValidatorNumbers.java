import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidatorNumbers  implements Validator {
    private boolean flag = false;
    boolean getFlag(){
        return flag;
    }

    private   String checkString ;
    void setCheckString(String checkString){
        this.checkString = checkString;
    }

    public void isValid () throws NumberExeption{
        Pattern pattern;
        //[^0-9]
        pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(checkString);
        while (matcher.find()){
            throw new NumberExeption();
            //if(!checkString.matches("[^0-9]")){throw new NumberExeption();}

        }

    }
}
