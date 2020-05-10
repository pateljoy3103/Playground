#include<iostream>
int main()
{
    int u,b;
    std::cin>>u;
    switch(u<=200)
    {
    case 1:
        b = u*0.5;
        std::cout<<"Rs."<<b;
        break;
    }
    switch(u>200 && u<=400)
    {
    case 1:
        b = (u*0.65) + 100;
        std::cout<<"Rs."<<b;
        break;
    }
    switch(u>400 && u<=600)
    {
    case 1:
        b = (u*0.80) + 200;
        std::cout<<"Rs."<<b;
        break;
    }
    switch(u>600)
    {
    case 1:
        b = (u*1.25) + 425;
        std::cout<<"Rs."<<b;
        break;
    }
}
