import java.util.*;
class empmaster

{
private int empno;
private String empname;
public void empno_access()
{
empno=101;
}
public void empname_access()
{
empname="raja";
}
public int empnoo()
{
return empno;
}
public String empnamee()
{
return empname;
}
}
class mathss
{
public static void main(String args[])
{
empmaster v=new empmaster();
v.empno_access();
v.empname_access();
System.out.println(v.empnoo());
System.out.println(v.empnamee());
}
}