import java.util.*;
public class mulcatch
{
public static void main(String[] args)
{
try
{
int a[]=new int[5];
a[5]=30/2;
}
catch(ArithmeticException e)
{System.out.println("arithmetic exception");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("arrayoutofbounds exception");
}
catch(Exception e)
{
System.out.println("parent exception occurs");
}
System.out.println("rest of the code");
}
}