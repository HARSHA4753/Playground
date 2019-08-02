#include<stdio.h>
int main()
{
 int num1,first,third,num2;
  scanf("%d",&num1);
  first=num1/100;
  third=num1%10;
  num2=first+third;
  printf("%d",num2);
  return 0;
}