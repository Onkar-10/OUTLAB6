import java.util.HashMap;
import java.util.regex.Pattern;
import java.io.* ;
import java.io.FileWriter;
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
        return (Pattern.matches("a+b+",s));
    }
}
