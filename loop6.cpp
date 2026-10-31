#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter n: ";
    cin>>n;
    for(int i=1;i<=n;i++){

        for(int j=1;j<=n-i;j++){
            cout<<"  ";
        }
        for(int k=1;k<=i;k++){
            cout<<k<<" ";
        }
        for(int p=1;p<=i;p++){
            cout<<p<<" ";
        }
        cout<<endl;
    }
    
}