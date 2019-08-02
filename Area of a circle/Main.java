#include<stdio.h>
int main()
{
  float pi=3.14,d,r,area;
  scanf("%f",&d);
  r=d/2;
  area=pi*r*r;
  printf("%.2f",area);
  return 0;
}