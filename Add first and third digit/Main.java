#include<stdio.h>
int main()
{
  int c;
  scanf("%d",&c);
  int d=(c/100)+(c%10);
  printf("%d",d);
  return 0;
}