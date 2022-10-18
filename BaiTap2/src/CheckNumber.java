import java.security.PublicKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {
    private static final String CLASS_REGEX = "^\\d{2}[-][0]\\d{8}$";
    public CheckNumber(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
