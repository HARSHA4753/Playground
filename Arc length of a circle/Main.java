#include<stdio.h>
int main()
{
  float r,a,pi=3.14;
  float arc;
  scanf("%f%f",&r,&a);
  arc=2 * pi * r *(a/360);
  printf("%.2f",arc);
  return 0;
}
