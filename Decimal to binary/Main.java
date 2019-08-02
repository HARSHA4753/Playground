#include<stdio.h>
int main()
{
  int n,binary=0,re,i=1;
  scanf("%d",&n);
  while(n>0)
  {
    re=n%2;
    n=n/2;
    binary=binary+(re*i);
    i=i*10;
  }
  printf("%d",binary);
  return 0;
}