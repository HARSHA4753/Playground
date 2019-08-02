#include<stdio.h>
int main()
{
  int n,re,octal=0,i=1;
  scanf("%d",&n);
  while(n>0)
  {
    re=n%8;
    n=n/8;
    octal=octal+(re*i);
    i=i*10;
  }
  printf("%d",octal);
  return 0;
}