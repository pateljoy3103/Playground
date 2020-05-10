#include<iostream>
int main()
{
    int r, c, t;
    std::cin>>r>>c>>t;
    switch(r+c==t || (r+c)*2==t)
    {
    case 1:
        std::cout<<"It is a mango tree";
        break;
    case 0:
        std::cout<<"It is not a mango tree";
        break;
    }
}
