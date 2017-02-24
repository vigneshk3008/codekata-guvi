#include<stdio.h>
#include<conio.h>
void main()
{
 int n;
 clrscr();
 scanf("%d",&n);
 if((n!=0) && ((n&(~n+1))==n))
 {
	printf("\nthe given number %d is power of 2 ",n);
 }
 else
	printf("\nthe given number %d is not a power of 2 ",n);
 getch();
}
