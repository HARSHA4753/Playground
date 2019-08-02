#include<stdio.h>
int main()
{
  int n,re,dec,i;
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {
    re=n%10;
    n=n/10;
    dec=dec+(pow(2,i))*re;
  }
  printf("%d",dec);
    
  return 0;
}