import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoUsingURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            content = content.replaceAll("\\<\\/a\\>", "");
            content = content.replaceAll("\\&quot[\\;]?+", "");
            Pattern p = Pattern.compile("article-title\">(.*?)</h3>");
            Matcher math = p.matcher(content);
            while (math.find()) {
                String str = math.group(1  );
                str = str.replaceAll("\\&qout\\;","");
                String[] arrStr = str.split("htm\">");
                System.out.println(arrStr[1] + "\n");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}