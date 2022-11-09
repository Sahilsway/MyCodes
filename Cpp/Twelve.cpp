/*Define a class student with the following specification:
 rollno : integer sname : 20 characters
 Derive two classes artst and scst.
    The class artst will represent students belonging to arts stream and 
    the class scst will represent students belonging to science stream.
    The artst class will have additional data members ph, hs, and en
        to store marks obtained by a student in three subjects Philosophy, History, English and Assamese. 
    The class scst will have additional data members ph, ch, and ma 
        to store marks obtained in Physics, Chemistry, Mathematics and English.
 Write the following member functions in the classes artst and scst 
    calTotal() : a function to calculate the total marks obtained by a student 
    getMarks() : function to accept values of the data members 
    displayMarksheet() : function to display the marks sheet of a student . 
*/

#include<iostream>
using namespace std;


class student {

    public:
    int rollNo;
    char sName[20];

    // Function to check stream of the student
    void checkStream () {
        char stream;
        cout << "Are you a arts student or science student? \n Enter 'a' for arts student and 's' for science student : ";
        cin >> stream;

        if (stream == 'a' || stream == 'A') {
            artSt sd;
            sd.getData();
            sd.displayMarksheet();
        } else if (stream == 's' || stream == 'S') {
            scSt sd;
            sd.getData();
            sd.displayMarksheet();
        }else {
            cout << "You have entered invalid stream";
        }
    }
};


// Class for Students of Arts Stream
class artSt : student {

    public:
    int ph;
    int hs;
    int en;

    // Function to calculate total marks of student
    int calTotal (int sub1, int sub2, int sub3) {
        int TM = sub1 + sub2 + sub3;

        return TM;
    }

    // Function to recieve marks of student
    void getData () {

        cout << "Enter Roll No of the Student : ";
        cin >> rollNo;
        cout << "Enter Name of the Student : ";
        cin >> sName;

        cout << "Enter marks obtained in Philosophy subject : ";
        cin >> ph;
        cout << "Enter marks obtained in History subject : ";
        cin >> hs;
        cout << "Enter marks obtained in English subject : ";
        cin >> en;

        int TM = calTotal(ph, hs, en);
    }

    // Function to display marksheet of student
    void displayMarksheet () {

        cout << "Stream of the Student : ARTS" << endl;
        cout << "Roll No of the Student : " << rollNo << endl;
        cout << "Name of the Student : " << sName << endl;
        cout << "\n\n\n\n*****Student Marksheet*****" << endl;
        cout << "Philosophy   -   " << ph << endl;
        cout << "History   -   " << hs << endl;
        cout << "English   -   " << en << endl;

    }
};


// Class for Students of science Stream
class scSt : student {

    public:
    int phy;;
    int chem;
    int math;


    // Function to calculate total marks of student
    int calTotal (int sub1, int sub2, int sub3) {
        int TM = sub1 + sub2 + sub3;

        return TM;
    }

    // Function to recieve marks of student
    void getData () {

        cout << "Enter Roll No of the Student : ";
        cin >> rollNo;
        cout << "Enter Name of the Student : ";
        cin >> sName;

        cout << "Enter marks obtained in Phisics subject : ";
        cin >> phy;
        cout << "Enter marks obtained in Chemistry subject : ";
        cin >> chem;
        cout << "Enter marks obtained in Mathematics subject : ";
        cin >> math;

        int TM = calTotal(phy, chem, math);
    }

    // Function to display marksheet of student
    void displayMarksheet () {

        cout << "Stream of the Student : SCIENCE" << endl;
        cout << "Roll No of the Student : " << rollNo << endl;
        cout << "Name of the Student : " << sName << endl;
        cout << "\n\n\n\n*****Student Marksheet*****" << endl;
        cout << "Phisics   -   " << phy << endl;
        cout << "Chemistry   -   " << chem << endl;
        cout << "Mathematics   -   " << math << endl;

    }
};


// Driver Code
int main () {
    student obj;
}