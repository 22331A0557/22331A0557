#include<iostream>
using namespace std;
class accesSpecifierDemo{
    private:
    int priVar;

    protected:
    int proVar;

    public:
    int pubVar;

    void setVar(int priValue,int proValue,int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }

    int getpriVar()
    {
        return priVar;
    }
    int getproVar()
    {
        return proVar;
    }
    int getpubVar()
    {
        return pubVar;
    }
};

int main()
{
    accesSpecifierDemo obj;
    obj.setVar(10,20,30);
    cout<< "priVar : "<< obj.getpriVar() << endl;
    cout<< "proVar : "<< obj.getproVar() << endl;
    cout<< "pubVar : "<< obj.getpubVar() << endl;
}
