#include<stdio.h>
#include<conio.h>
void main()
{
  int *ptr1,*ptr2;
  int sum=0;
  clrscr();
  printf("Enter the two numbers:");
  scanf("%d%d",ptr1,ptr2);
  sum=*ptr1+*ptr2;
  printf("the result is : %d\t%d",sum,ptr1);
  getch();
}
