#include<stdio.h>
#include<math.h>
int main()
{
  float a1,a2;
  float hyp;
  scanf("%f%f",&a1,&a2);
  hyp=sqrt(a1*a1+a2*a2);
  printf("%.2f",hyp);
  return 0;
}