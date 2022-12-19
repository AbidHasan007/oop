1.#include<iostream>
using namespace std;
void volume(double l,double w,double h)
{
    cout<<"Volume of a rectangle: "<<l*w*h<<endl;
}
void volume(double r,double h)
{
    cout<<"Volume of a cylinder: "<<3.1416*r*r*h<<endl;
}
void volume(double s)
{
    cout<<"Volume of a cube: "<<s*s*s<<endl;
}
int main()
{
    double l,w,h,a;
    double r;
    cout<<"\nEnter the values of length,width and hight for the rectangle:";
    cin>>l>>w>>h;
    volume(l,w,h);
    cout<<"\nEnter the values of Radius and hight for the Cylinder:";
    cin>>r>>h;
    volume(r,h);
 cout<<"\nEnter the values of 'a' for the Cube:";
    cin>>a;
    volume(a);
    return 0;
}
2.#include <iostream>
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
3.#include<iostream>
using namespace std;
class COMPLEX
{
    int real, imaginary;
public:
    COMPLEX();
    COMPLEX(int a,int b);
    COMPLEX operator +(COMPLEX co );
    void display();
};
COMPLEX::COMPLEX()
{
    real=imaginary=0;
}
COMPLEX::COMPLEX(int a,int b)
{
    real=a;
    imaginary=b;
}
COMPLEX COMPLEX::operator+(COMPLEX co)
{
    COMPLEX tmp;
    tmp.real=real+co.real;
    tmp.imaginary=imaginary+co.imaginary;
    return tmp;
}
 void COMPLEX::display()
 {
     cout<<real<<"+i"<<imaginary<<endl;
 }

int main()
{
    int i,j;
    cout<<"Enter the complex number:"<<endl;
    cin>>i>>j;
    COMPLEX c1(i,j);
    cout<<"Enter the complex number:"<<endl;
    cin>>i>>j;
    COMPLEX c2(i,j),c3;
    c3=c1+c2;
    cout<<"The complex numbers: "<<endl;
    c1.display();
    c2.display();
    cout<<"Summation is: ";
    c3.display();

    return 0;
}
4.#include <iostream>
using namespace std;
class B;
class A{
int a;
public:
    A(int x)
    {
        a=x;
    }
    friend void largest(A a1, B b1);
    friend void smallest(A a1, B b1);
};
class B{
int b;
public:
    B (int y)
    {
        b=y;
    }
    friend void largest(A a1, B b1);
    friend void smallest(A a1, B b1);
};
void largest(A a1, B b1)
{
    if(a1.a>b1.b)
        cout<<"The largest number is a="<<a1.a<<endl;
    else
        cout<<"The largest number is b="<<b1.b<<endl;
}
void smallest(A a1, B b1)
{
    if(a1.a<b1.b)
        cout<<"The smallest number is a="<<a1.a<<endl;
    else
        cout<<"The smallest number is b="<<b1.b<<endl;
}
int main()
{
    int val1,val2;
    cout<<"Enter the value for a"<<endl;
    cin>>val1;
    A ax(val1);
    cout<<"Enter the value for b"<<endl;
    cin>>val2;
    B by(val2);
    cout<<"Finding the largest and smallest between two number of two different classes:"<<endl;
    largest(ax,by);
    smallest(ax,by);
    return 0;
}
6.#include <iostream>
#include <iomanip>
using namespace std;
class FLOAT
{
    float a;
public:
    FLOAT()
    {
        a=0.0;
    }
    FLOAT(float num1);
    FLOAT operator + (FLOAT o);
    FLOAT operator - (FLOAT o);
    FLOAT operator * (FLOAT o);
    FLOAT operator / (FLOAT o);
    void display();
};
FLOAT :: FLOAT(float num1)
{
    a=num1;
}
FLOAT FLOAT :: operator +(FLOAT o)
{
    FLOAT c;
    c.a =a+ o.a;
    return c;
}
FLOAT FLOAT :: operator -(FLOAT o)
{
    FLOAT c;
    c.a =a- o.a;
    return c;
}
FLOAT FLOAT :: operator *(FLOAT o)
{
    FLOAT c;
    c.a =a* o.a;
    return c;
}
FLOAT FLOAT :: operator /(FLOAT o)
{
    FLOAT c;
    c.a =a/ o.a;
    return c;
}
void FLOAT :: display()
{
    cout<<"Result="<<a<<endl;
}
int main()
{
    float f1,f2;
    cout<<"Enter two floating point number:"<<endl;
    cin>>f1>>f2;
    FLOAT o1(f1), o2(f2), o3;
    cout<<"Addition:"<<endl;
    o3=o1+o2;
    o3.display();
    cout<<"Subtraction:"<<endl;
    o3=o1-o2;
    o3.display();
    cout<<"Multiplication:"<<endl;
    o3=o1*o2;
    o3.display();
    cout<<"Division:"<<endl;
    o3=o1/o2;
    o3.display();
    return 0;
}
7.#include <iostream>
using namespace std;
class area_cl
{
public:
    double height;
    double width;
    double area();
};
class rectangle : public area_cl
{
public:
    rectangle(double h, double w)
    {
        height=h;
        width=w;
    }
    double area()
    {
        return (height*width);
    }
};
class isosceles : public area_cl
{
public:
    isosceles(double h, double w)
    {
        height=h;
        width=w;
    }
    double area()
    {
        return (0.5*height*width);
    }
};
int main()
{
    double result;
    rectangle r1(5,3);
    result=r1.area();
    cout<<"The area of a rectangle is: "<<result<<endl;
    isosceles i1(5,3);
    result=i1.area();
    cout<<"The area of a isosceles triangle is: "<<result<<endl;
    return 0;
}
8.#include<iostream>
using namespace std;
class shape
{
public:
    double lenght,width,heigth;
    virtual void area()
    {
        cout<<"Shape area"<<endl;
    }
    virtual void volume()
    {
        cout<<"Shape volume"<<endl;
    }
    virtual void print()=0;
};
class rectangle:public shape
{
public:
    double areas;
   void getdata(){
    cout<<"\nEnter the values for rectangle:\n";
    cin>>lenght>>width;

   }
   void area()
   {
       areas=lenght*width;
   }
    virtual void print()
    {
        cout<<"\nArea of the rectangle:"<<areas;
    }
};
class cube: public rectangle
{
public:
    double vol;
    void getdata()
    {
      cout<<"\nEnter the values for cube:\n";
    cin>>heigth;
    }
    void volume()
    {
        vol=heigth*heigth*heigth;
    }
    void print()
    {
        cout<<"\nVolume of the cube:"<<vol;
    }
};
int main()
{
    shape *sp;
    rectangle r;
    r.getdata();
    sp=&r;
    sp->area();
    sp->print();
    cube c;
    c.getdata();
    sp=&c;
    sp->volume();
    sp->print();
    return 0;
}

9.#include<iostream>
#include<string>
#include<fstream>
using namespace std;
int main()
{
    ifstream ifs1,ifs2;
    char file1[100];
    ifs.open("read.txt",ios::in);
    ifs.open("read2.txt",ios::in);
    if(!ifs1 || !ifs2)
        {
            cout<<"Error in opening file.";
        }
    while(ifs.eof()==0)
        {
            ifs>>file1;
            cout<<file1<<" ";
            if(ifs1.eof())
                {
                    while(ifs.eof()==0)
                        {
                            ifs>>file1;
                            cout<<file1<<" ";
                        }
                }
            ifs.close();
            return 0;
        }
10.#include<iostream>
#include<fstream>
using namespace std;
int main ()
{
    fstream my_file;
    fstream new_file;
    char ch;
    my_file.open("file1.txt",ios::in);
    if(!my_file)
    {
        cout<<"No such file";

    }
    new_file.open("file2.txt",ios::out);
    if(!new_file)
    {
        cout<<"No such file";

    }
    else{
        while(1)
        {
            my_file>>ch;
            if(my_file.eof())
                break;
            cout<<ch;
            new_file<<ch;
        }
        cout<<endl<<"Successfully stored in file2"<<endl;
    }

    my_file.close();

    new_file.close();
    return 0;
}
