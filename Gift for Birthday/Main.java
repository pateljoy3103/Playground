#include<iostream>
int main()
{
    int y;
    std::cin>>y;
    switch(y%4==0)
    {
    case 1:
        std::cout<<y<<" is a leap year";
        break;
    case 0:
        std::cout<<y<<" is not a leap year";
        break;
    }
}
