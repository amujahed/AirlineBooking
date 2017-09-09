package airline.util;

public class NullCheck {
    public static boolean nullCheckOnString(String string)
    {
        boolean nullCheck=true;
        if(!(string == null || string.isEmpty()))
            nullCheck=false;
        return nullCheck;
    }
}
