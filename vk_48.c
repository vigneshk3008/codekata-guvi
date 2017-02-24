#include<stdio.h>
#include<conio.h>
void main()
{
  int n,i,sum=0,a[5];
  long int avg;
  clrscr();
  for(i=0;i<5;i++)
  {
	scanf("%d",&a[i]);
  }
  for(i=0;i<5;i++)
  {
	sum+=a[i];
  }
  avg=sum/5;
  printf("%ld",avg);
  getch();
}
