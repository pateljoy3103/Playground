#include<iostream>
int main()
{
    float m,x;
    int l, d;
    std::cin>>m>>l>>d;
    x = m*l;
    switch(x>d)
    {
    case 1:
        std::cout<<"Can reach";
        break;
    case 0:
        std::cout<<"Cannot reach";
        break;
    }
}
