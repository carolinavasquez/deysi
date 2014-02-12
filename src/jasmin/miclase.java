package jasmin;

import java.util.Scanner;

public class miclase 
{

	public static void main(String[] args)
	{
		Scanner miscanner=new Scanner(System.in);
		System.out.print("ingrese un numero");
		int num1=miscanner.nextInt();
		System.out.print("ingrese otro numero");
		int num2=miscanner.nextInt();
		System.out.print("ingrese 1 para +; 2 para -; 3 para *; 4 para /");
		int num3=miscanner.nextInt();
		{
		if(num3==1)

		System.out.print("suma es:");
		System.out.println(num1+num2);
		}
		{
		if(num3==2)
		System.out.print("resta es:");
		System.out.println(num1-num2);
		}
		{
		if(num3==3)
		System.out.print("multiplicacion es:");
		System.out.println(num1*num2);
		}
		{
		if(num3==4)
		System.out.print("division es:");
		System.out.println(num1/num2);
		}
	}
}



