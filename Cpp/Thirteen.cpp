//  Define an abstract base class printer. 
//  Derive three classes laser-printer, line-printer and inkjet-printer. 
//  The derived classes will have data members to store the features of that particular printer. 
//  Write pure virtual function display() in the base class and redefine it in the derived
//  classes.

#include<iostream>
using namespace std;

class printer {

    public:
    virtual void display() = 0;
};

class laserPrinter : public printer {

    string feature1 = "Hight quality printouts";
    string feature2 = "Prints with laser and electric charge model";
    public:
    void display() {
        cout << "FEATURES OF LASER PRINTER ARE : \n";
        cout << feature1 << endl;
        cout << feature2 << endl;
        cout << endl;
    }
};

class linePrinter : public printer {

    string feature1 = "HIght speed printouts";
    string feature2 = "Print an entire line at a time";
    public:
    void display() {
        cout << "FEATURES OF LINE PRINTER ARE : \n";
        cout << feature1 << endl;
        cout << feature2 << endl;
        cout << endl;
    }
};

class inkjetPrinter : public printer {

    string feature1 = "Produce hard copies by jetting ink onto paper";
    string feature2 = "Affordable price";
    public:
    void display() {
        cout << "FEATURES OF INKJET PRINTER ARE : \n";
        cout << feature1 << endl;
        cout << feature2 << endl;
        cout << endl;
    }
};

int main() {
    laserPrinter lsp;
    lsp.display();

    linePrinter lnp;
    lnp.display();

    inkjetPrinter ikp;
    ikp.display();

    return 0;
}
