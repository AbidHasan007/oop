#include <iostream>
using namespace std;
class shape
{
    public:
    int length, width, height;
    virtual void area()
    {
        cout<<"Shape Area"<<endl;
    }
    virtual void volume()
    {
        cout<<"Shape Volume"<<endl;
    }
    virtual void print()=0;
};
class rectangle : public shape
{
    int areas;
    public:
    void setValue(int l, int w)
    {
        length=l;
        width=w;
    }
    void area()
    {
        areas=length*width;
    }
    void print()
    {
        cout<<"The area of a rectangle is: "<<areas<<endl;
    }
};
class cube: public rectangle
{
    int areas;
public:
    void setValue(int a)
    {
        height=a;
    }
    void volume()
    {
        areas=height*height*height;
    }
    void print()
    {
        cout<<"The volume of a cube is: "<<areas<<endl;
    }
};
int main()
{
    shape *sp;
    rectangle r;
    r.setValue(4,6);
    sp=&r;
    sp->area();
    sp->print();
    cube c;
    c.setValue(5);
    sp=&c;
    sp->volume();
    sp->print();
    return 0;
}
