#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter n: ";
    cin>>n;
    
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            cout<<"  ";
        }
        for(int p=1;p<=i-1;p++){
            if(i>1){
                cout<<p<<" ";
            }
        }
        for(int j=i;j>=1;j--){
            cout<<j<<" ";
        }
        cout<<endl;
    }
}