#include<iostream>
#include<bits/stdc++.h>
int main()
{
    float i,j,k,l,m,n;
    std::cin>>i>>j;
    l = i*j;
    k = ((j/100)*50);
    switch(i<=2)
    {
    case 1:
        std::cout<<l-k<<std::fixed<<std::setprecision(2);
        break;
    }
    switch(i==3)
    {
    case 1:
        std::cout<<2*j<<std::fixed<<std::setprecision(2);
        break;
    }
    switch(i>3)
    {
    case 1:
        std::cout<<"Number of items is more";
    }
}