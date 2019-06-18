#include<stdio.h>
int main()
{
int a,to=0;
  scanf("%d",&a);
  while(a!=0)
  {
  int p=a%10;
  to+=p;
  a=a/10;
  }
  printf("%d",to);
  return 0;
}