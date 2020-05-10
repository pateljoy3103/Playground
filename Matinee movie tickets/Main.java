#include<iostream>
int main()
{
    int a;
    float t;
    float x=10.15, y=13.30, z=18.00, w=22.00;
    std::cin>>a>>t;
    switch (a>=13)
    {
    case 1:
    {
        switch(t==y)
        {
        case 1:
            std::cout<<"$5.00";
            break;
        }
        switch(t==x || t==z || t==w)
        {
        case 1:
            std::cout<<"$8.00";
            break;
        }
        break;
    }
    case 0:
    {
        switch(t==y)
        {
        case 1:
            std::cout<<"$2.00";
            break;
        }
        switch(t==x || t==z || t==w)
        {
        case 1:
            std::cout<<"$4.00";
            break;
        }
        break;
    }
    }
}