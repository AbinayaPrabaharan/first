import java.util.*;
public class nestedtryblock
{
public static void main(String args[])
{
try
{
try
{
try
{
int arr[]={1,2,3,4};
System.out.println(arr[10]);
}
catch(ArithmeticException r)

{
System.out.println("Arithmetic exception");
System.out.println("inner try block2");
}

}
catch(ArithmeticException e)
{System.out.println("inner try block1");
}
}
catch(ArrayIndexOutOfBoundsException e4)
{
System.out.println(e4);
System.out.println("outer(main)try block");
}
catch(Exception e5)
{
System.out.println("exception");
System.out.println("handled in main try block");
}
}
}
