#include<iostream.h>
#include<conio.h>
void main()
{
  int i,a[5],temp,j;
  clrscr();
  for(i=0;i<5;i++)
  {
    cin>>a[i];
  }
  for(i=1;i<=5;i++)
  {
    for(j=0;j<5-1;j++)
    {
      if(a[j]>a[j+1])
      {
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
 cout<<"Max : "<<a[4]<<"\t Min : "<<a[0];
 getch();
}
