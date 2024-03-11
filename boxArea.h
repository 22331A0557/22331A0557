#include<iostream>
using namespace std;
void boxArea(float length,float width,float height)
{
    float area = 2*(length*width+width*height+height*length);
    cout << "Area of the box is " << area << endl;
}
boxVolume.h
#include<iostream>
using namespace std;
void boxVolume(float length,float width,float height)

{
    float vol = length*width*height;
    cout << "Volume of the box is " << vol << endl;
}
