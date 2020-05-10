#include<iostream>
int main()
{
  int a,b;
  int s,t,m,d,u;
  std::cin>>a>>b;
  s = a + b;
  t = a - b;
  m = a * b;
  d = a / b;
  u = a % b;
  std::cout<<"a+b="<<s<<"\n";
  std::cout<<"a-b="<<t<<"\n";
  std::cout<<"a*b="<<m<<"\n";
  std::cout<<"a/b="<<d<<"\n";
  std::cout<<"a%b="<<u<<"\n";
}
