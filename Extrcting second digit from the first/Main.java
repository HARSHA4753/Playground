#include <stdio.h>
int main() {
	int num,secondDigit;
  scanf("%d",&num);
  while(num>100)
  {
    num=num/10;
  }
  secondDigit=num%10;
  printf("%d",secondDigit);
	return 0;
}