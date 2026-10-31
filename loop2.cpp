#include<iostream>
using namespace std;
int main(){
    int n;
    int k=0;
    cout<<"Enter element:";
    cin>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            k=k+1;
            cout<<k<<" ";
        }
        cout<<endl;
    }
}