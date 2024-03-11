#include<iostream>
using namespace std;
class vehicle{
    string brand;
    int year;
    public:
    void setp(){
        cout<<"enter the brand name : "<<endl;
        cin>>brand;
        cout<<"manufacturing year : "<<endl;
        cin>>year;
    }
    void display1(){
        cout<<"vehicle details"<<endl;
        cout<<"brand : "<<brand<<endl;
        cout<<"year : "<<year<<endl;
    }
};
class car: public vehicle{
    int seats;
    public:
    void setc(){
        setp();
        cout<<"enter no of seats : "<<endl;
        cin>>seats;
    }
    void display(){
        display1();
        cout<<"no of seats : "<<seats<<endl;
    }
};
int main(){
    car car1;
    car1.setc();
    car1.display(); 
}
