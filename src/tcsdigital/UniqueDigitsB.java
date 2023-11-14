package tcsdigital;

import java.util.Scanner;

public class UniqueDigitsB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int l = sc.nextInt();
		int x;
		sc.close();
		int flag = 1, count=0,rem1=0,rem2=0,temp;
		for(int i=f;i<=l;i++)
		{
			x=i;
			flag = 1;
			while(x>0)
			{
				
				rem1 = (i%10);
				temp = i/10;
				rem2 = (temp%10);
				if(rem1==rem2)
				{
					flag = 0;
					break;
					
				}
				else if(temp/10 == 0)
				{
					break;
				}
				else
				{
					i=temp;
				}
			}
			if(flag==1) {
				count++;
			}
			i=x;
			
		}
		System.out.println(count);
	}
}
