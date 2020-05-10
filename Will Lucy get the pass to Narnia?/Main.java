#include<iostream>
int main()
{
    int a,b,m,c;
    std::cin>>a>>b>>m;
    std::cout<<"Enter first number : Enter second number : Menu\n";
    std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
    switch(m)
    {
    case 1:
        c = a + b;
        std::cout<<"\n"<<c;
        break;
    case 2:
        c = a - b;
        std::cout<<"\n"<<c;
        break;
    case 3:
        c = a * b;
        std::cout<<"\n"<<c;
        break;
    case 4:
        c = a / b;
        std::cout<<"\n"<<c;
        break;
    case 5:
        c = a % b;
        std::cout<<"\n"<<c;
        break;
    default:
        std::cout<<"\n"<<"Invalid operation";
    }
}