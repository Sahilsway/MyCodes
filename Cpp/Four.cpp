
#include<iostream>
using namespace std;

class complex {

    public:
    int real;
    int imag;


    //   ****  DONT WRITE THE CODE BELOW  ****   """I'LL SCREW YOU MF"""

    // complex() {
    //     real = 0;
    //     imag = 0;
    // }

    // complex(int a) {
    //     real = 0;
    //     imag = 0;

    //     cout << "Enter a real and a imaginary number for first complex number : ";
    //     setValue();
    // }

    // complex(int a, int b) {
    //     real = 0;
    //     imag = 0;

    //     cout << "Enter a real and a imaginary number for first complex number : ";
    //     setValue();
    //     add(real, imag);
    // }

    //   ****  DONT WRITE THE CODE ABOVE  ****


    //set values to the complex numbers
    void setValue() {
        cin >> real;
        cin >> imag;
    }

    //addition of two complex number
    void add (complex c1, complex c2) {
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    //multiplication of two complex number
    void mul (complex c1, complex c2) {
        real = c1.real * c2.real;
        imag = c1.imag * c2.imag;
    }

    void display() {
        cout << real << " + " << imag << " i "<< endl;
    }

    //printing real and imaginary part

    int rPart(complex c1) {
        real = c1.real;
        return real;
    }

    int iPart(complex c1) {
        imag = c1.imag;
        return imag;
    }
    
};

//driver code
int main () {

    complex c1, c2, c3;
    cout << "Enter a real and a imaginary number for first complex number : ";
    c1.setValue();

    cout << "Enter a real and a imaginary number for second complex number : ";
    c2.setValue();

    int real = c1.rPart(c1);
    cout << "The real part of given complex number is : ";
    cout << real << endl;

    int imag = c1.iPart(c1);
    cout << "The imaginary part of given complex number is : ";
    cout << imag << endl;

    cout << "Sum of two complex number is : ";
    c3.add(c1, c2);
    c3.display();

    cout << "Multiple of two complex number is : ";
    c3.mul(c1, c2);
    c3.display();

}
