#include<stdio.h>
int main()
{
 int a;
  scanf("%d",&a);
  switch(a)
  {
  case 1:
  printf("One");
  break;
  case 3:
  printf("Three");
  break;
  default:
  printf("Invalid");
  }
  return 0;
}