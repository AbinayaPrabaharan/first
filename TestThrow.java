import java.util.*;
class UserDefinedException extends Exception
{
public UserDefinedException(String str)
{
super(str);
}
}
public class TestThrow
{
public static void main(String args[])
{
try
{
throw new UserDefinedException("this is userdefinedexception");
}
catch(UserDefinedException ude)
{
System.out.println("caught the exception");
System.out.println(ude.getMessage());
}

}}
