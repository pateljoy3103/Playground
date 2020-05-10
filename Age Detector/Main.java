#include<iostream>
int main()
{
    int by, cy, a;
    std::cin>>by>>cy;
    switch(by>cy)
    {
    case 1:
        a = (100+cy) - by;
        std::cout<<a;
        break;
    case 0:
        a = cy - by;
        std::cout<<a;
        break;
    }
}