#include <stdio.h>
int main()
{
    int base, exponent;
    long long result = 1;
    scanf("%d", &base);
    scanf("%d", &exponent);
  if(exponent<0)
  {
    printf("Wrong input");
  }
  else
  {
    while (exponent != 0)
    {
        result *= base;
        --exponent;
    }
    printf("%lld", result);
  }
    return 0;
}