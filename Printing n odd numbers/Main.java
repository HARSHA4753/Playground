#include <stdio.h>
int main() {
	int n,count=0;
  scanf("%d",&n);
  for(int i=1;count<n;i++)
  {
    if(i%2!=0)
    {
      printf("%d\n",i);
      count=count+1;
    }
  }
	return 0;
}