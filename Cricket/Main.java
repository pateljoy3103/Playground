#include<iostream>
#include<bits/stdc++.h>
int main()
{
    int tb,tr,cr,cb;
    std::cin>>tb>>tr>>cr>>cb;
    float to = tb/6;
    int c = cb/6;
    int p = cb%6;
    float co = ((float)c+(float)p/10);
    float crr = cr/co;
    float trr = tr/to;
    std::cout<<to<<"\n"<<std::fixed<<std::setprecision(1)<<co<<"\n"<<crr<<"\n"<<trr;
    switch(crr>trr)
    {
    case 1:
        std::cout<<"\nEligible to Win";
        break;
    case 0:
        std::cout<<"\nNot Eligible to Win";
        break;
    }
}