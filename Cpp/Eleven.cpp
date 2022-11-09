// Write a class based program implementing static members

#include <iostream>
using namespace std;

class Class {

    public: 
    static int num;

};

int Class:: num = 5;

int main() {

    Class obj1, obj2;
      
    cout << "Value of num : " << obj1.num << endl;
    
    obj2.num = 7;
    
    cout << "New value of num : " << obj1.num << endl;
    return 0;
}
