#include <iostream>
using namespace std;
class time{
int h,m;
char ch;
public:
    time()
    {
        h=m=0;
    }
    void getData()
    {
        cout<<"Enter h : m"<<endl;
        cin>>h>>ch>>m;
    }
    void add(time &t1, time &t2);
    void display();
};
void  time :: add(time &t1, time &t2)
{
     m=t1.m+t2.m;
     h=m/60;
     m=m%60;
     h=h+t1.h+t2.h;
}
void time :: display()
{
    cout<<"Hours : Minutes"<<endl;
    cout<<h<<":"<<m<<endl;
}
int main()
{
    time a,b,c;
    a.getData();
    b.getData();
    c.add(a,b);
    c.display();
    return 0;
}
