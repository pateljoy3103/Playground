#include<iostream>
int main()
{
    int a,b,c;
    int x,y,z,hcf,st;
    std::cin>>a>>b>>c;
    x=a;
    y=b;
    z=c;
    if (a>=b && a>=c)
    {
        if(b>=c)
        {
            std::cout<<"The treasure is in box which has number "<<b<<"\n";
        }
        else
        {
            std::cout<<"The treasure is in box which has number "<<c<<"\n";
        }
    }
    else if(b>=a && b>=c)
        {
            if(a>=c)
            {
                std::cout<<"The treasure is in box which has number "<<a<<"\n";
            }
            else
            {
                std::cout<<"The treasure is in box which has number "<<c<<"\n";
            }
        }
    else if(a>=b)
        {
            std::cout<<"The treasure is in box which has number "<<a<<"\n";
        }
    else
        {
            std::cout<<"The treasure is in box which has number "<<b<<"\n";
        }
        st=x<b?(x<z?x:z):(y<z?y:z);
        for (hcf=st;hcf>=1;hcf--)
        {
            if (a%hcf==0 && b%hcf==0 && c%hcf==0)
                break;
        }
        std::cout<<"The code to open the box is "<<hcf;
}