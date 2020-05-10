#include<iostream>
int main()
{
    int fp,sp,ap;
    int fd,sd,ad;
    int fs,ss,as;
    int f,s,a;
    int df,ds,da;
    std::cin>>fp>>fd>>fs;
    std::cin>>sp>>sd>>ss;
    std::cin>>ap>>ad>>as;
    df = (fp*fd/100);
    ds = (sp*sd/100);
    da = (ap*ad/100);
    f = fp - df + fs;
    s = sp - ds + ss;
    a = ap - da + as;
    std::cout<<"In Flipkart Rs."<<f;
    std::cout<<"\nIn Snapdeal Rs."<<s;
    std::cout<<"\nIn Amazon Rs."<<a;
    switch(f<=s && f<a)
    {
    case 1:
        std::cout<<"\nHe will prefer Flipkart";
        break;
    }
    switch(s<f && s<a)
    {
    case 1:
        std::cout<<"\nHe will prefer Snapdeal";
        break;
    }
    switch(a<f && a<s)
    {
    case 1:
        std::cout<<"\nHe will prefer Amazon";
        break;
    }
}