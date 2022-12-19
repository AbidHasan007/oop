#include<iostream>
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
