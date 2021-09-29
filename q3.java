import java.util.HashMap;
import java.util.regex.Pattern;
import java.io.* ;
import java.util.regex.Matcher;
import java.util.*;

public class q3
{
    public Boolean func1(String s) {
        return ((s.length()<=5) && Pattern.matches("^[a-zA-Z0-9]*$",s));
    }

    public Boolean func2(String s) {
        return (Pattern.matches("a*b+c",s));
    }
    public Boolean func3(String s) {

        return (Pattern.matches("",s));  //can c exits
    }
    public List<String> func4(String input_s,String pattern_s){
        List<String> substrings_list = new ArrayList<>();
        Pattern our_pat = Pattern.compile(pattern_s);
        Matcher our_mat = our_pat.matcher(input_s);
    
        while (our_mat.find())
           substrings_list.add(our_mat.group());
        return substrings_list;
    }
}
