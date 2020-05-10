#include<iostream>
int main()
{
  int w,x,y;
  int p;
  int c = 100;
  std::cin>>w>>x>>y;
  p = (w*x) - (w*y) - c;
  std::cout<<p;
  return 0;
}