#include<iostream>
int main()
{
    int n,x=0;
    std::cin>>n;
    while(n>0)
    {
        x = n%10;
        std::cout<<x;
        n = n/10;
    }
}