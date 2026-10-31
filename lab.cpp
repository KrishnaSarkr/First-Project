#include<iostream>
using namespace std;
class student{
    public:
    virtual void calculateGrade(int a)=0;
    
};
class Regularstudent:public student{
    public:
    void calculateGrade(int a){
        if(a>80){
            cout<<"grade A+";
        }
        else if(a>70){
            cout<<"grade A";
        }
        else if(a>60){
            cout<<"grade A-";
        }
        else if(a>50){
            cout<<"grade B";
        }
        else if(a<40){
            cout<<"grade Fail";
        }

    }
};
int main(){
    student *stdptr;
    Regularstudent Kri;
    stdptr=&Kri;
    stdptr->calculateGrade(85);

}