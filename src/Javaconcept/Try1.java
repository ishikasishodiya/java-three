package Javaconcept;

import java.util.Scanner;
class Triangle{
int Abc(int a, int b, int c){
	int p=0;
if(a+b< c || a+c<b || b+c<a || a==0 || b==0 ||c==0){
try{
throw new Exception("thrown");

}
catch(Exception e){
System.out.print(e);
}
}

else
 p = a+b+c;
return p;
}
}

public class Try1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();
Triangle obj = new Triangle();
int result = obj.Abc(x,y,z);
System.out.print(result);
}
}
