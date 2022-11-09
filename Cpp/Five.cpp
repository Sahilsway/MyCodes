
#include <bits/stdc++.h>
using namespace std;

class point {

    public:
    int x = 5;
    int y = 5;

    //distance of the point from the origin
    float dist() {
        return sqrt(pow(x - 0, 2) + pow(y - 0, 2));
    }
    
    //find slope of the line
    float slope() {
        if (x - 0 != 0)
            return (y - 0) / (x - 0);
        return INT_MAX;
    }


    //   ****  DONT WRITE THE CODE BELOW  ****   """I'LL SCREW YOU MF"""

    // public:
    // point() {
    //     int zero, one, two;
    // }

    // friend float disOfTwoPoints(point);
    
    // float disOfTwoPoints(point a) {
    
    // }

    //   ****  DONT WRITE THE CODE ABOVE  ****


};


// Drivers Code
int main() {
    point obj;

    float d = obj.dist();
    float s = obj.slope();
    
    cout << "Distance of the point from the origin is : " << d << endl;

    cout << "Slope of the line is : " << s;

    return 0;
}
