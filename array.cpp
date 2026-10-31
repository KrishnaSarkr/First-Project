#include<iostream>
using namespace std;
int main(){
    int c=0,c1=0,c2=0,c3=0,c4=0,c5=0;
    string s;
  
    cout<<"Enter array:";
    getline(cin,s);
    
    
    for(int i=0;i<s.size();i++){
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
            c++;
        }
        if(s[i]=='a'){
            c1++;
        }
        if(s[i]=='e'){
            c2++;
        }
        if(s[i]=='i'){
            c3++;
        }
        if(s[i]=='o'){
            c4++;
        }
        if(s[i]=='u'){
            c5++;
        }
      
    }
    cout<<"vowels:"<<c<<endl;
    cout<<"Num of a: "<<c1<<endl;
    cout<<"Num of e: "<<c2<<endl;
    cout<<"Num of i: "<<c3<<endl;
    cout<<"Num of o: "<<c4<<endl;
    cout<<"Num of u: "<<c5<<endl;
  
}