import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,a=0,b=0,c=0,sum=0;
n=sc.nextInt();
a=n%10;
b=n%100;
b=(b-a)/10;
c=n/100;
sum=(a*a*a)+(b*b*b)+(c*c*c);
if(sum==n)
{
System.out.println(n+" is armstrong number");
}
else
{
System.out.println("The given number is not armstrong number");
}
}
}
