#include<iostream>
int main()
{
  int m,a;
  std::cin>>m>>a;
  if(a<m)
    std::cout<<"Yes, you can enter.";
  else if(m==a)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}