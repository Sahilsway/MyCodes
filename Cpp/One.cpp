// 


#include<iostream>
using namespace std;

class triangle {
    
    public:
    triangle() {

        float sideA = 20;
        float sideB = 20;
        float sideC = 20;

        displayTriangleType(sideA, sideB, sideC);

    }

    //check triangle
    void displayTriangleType (float a, float b, float c) {

        if(a == b && b == c) {
            cout << "Equilateral Triangle";
        } else if (a == b || b == c || c == a) {
            cout << "Isosceles traingle";
        } else {
            cout << "Scalene traingle";
        }
        return;
    }
};


//Driver Code
int main() {

    triangle obj;
}
