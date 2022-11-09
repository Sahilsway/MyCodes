
#include<iostream>
using namespace std;
const float PI = 3.14;

class circle {

    public:
    circle() {
        int radius = 35;

        area(radius);
        perimeter(radius);
    }
    
    //check area
    void area(int r) {
        float A = PI * r * r;
        cout << "Area of the circle is = " << A <<endl;
    }

    //check perimeter
    void perimeter(int r) {
        float P = 2 * PI * r;
        cout << "Perimeter of the circle is = " << P;
    }
};

//driver code
int main() {

    circle obj;
    
    return 0;
}