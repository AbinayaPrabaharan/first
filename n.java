import java.util.*;
class person
{
int f;
public void access()
{
f=20;
System.out.println(f);
}
}
class n
{
public static void main(String ar[])
{
new person().access();
}
}