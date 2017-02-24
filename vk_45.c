#include<stdio.h>
#include<conio.h>
void main()
{
  int l,u,n;
  clrscr();
  printf("\nenter the lower and upper range : ");
  scanf("%d%d",&l,&u);
  printf("\nenter the number between your range : ");
  scanf("%d",&n);
  if((n>l) && (n<u))
  {
	printf("\nYour value is valid");
  }
  else
  {
	printf("\nenter the valid number between %d and %d",l,u);
  }
  getch();
}
