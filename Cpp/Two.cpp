#include<iostream>
using namespace std;

struct employee {
    int empNo;
    string eName[20];
    float basic;
    float hra;
    float da;
};

float calNetPay(float basic, float hra, float da) {
    float NetPay = basic + hra + da;
    return NetPay;
}

getData() {
    cout << "Enter employee No : ";
    cin >> employee.empNo;
    
    cout << "Enter employee Name : ";
    cin >> employee.empName;

    cout << "Enter basic Sallary : ";
    cin >> employee.basic;

    cout << "Enter HR's annual Sallary : ";
    cin >> employee.hra;

    cout << "Enter Director's annual Sallary : ";
    cin >> employee.da;
}

void getData.display() {
    cout << "Employee No : " << empNo;

    cout << "Employee Name : " << empName;

    cout << "Basic Sallary : " << empName;

    cout << "HR's annual Sallary : " < hra;

    cout << "Enter Director's annual Sallary : " << da;

}

int main() {
    struct employee emp1;
    emp1.empNo = 1;
    emp1.eName = "Simon";
    emp1.basic = 84000.63;
    emp1.hra = 6387234.84;
    emp1.da = 7363590.64;

    return 0;
}