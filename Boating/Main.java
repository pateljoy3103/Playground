#include<iostream>
int main()
{
    int a,c,w,z;
    int x=75, y=30;
    std::cin>>w>>a>>c;
    z = (a*x) + (c*y);
    switch(z<w)
    {
    case 1:
        std::cout<<"Boat is stable";
        break;
    case 0:
        std::cout<<"Boat will drow";
        break;
    }
}