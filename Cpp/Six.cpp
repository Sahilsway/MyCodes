
#include<iostream>
// #include<string>
using namespace std;

class Strings {
    // char *p;
    // int size;
    
    public:
    Strings() {
        char str1[20];
        char str2[20];

        // Taking input First string

        cout << "Enter First String : ";
        gets (str1);
        int str1L = strLength(str1);

        cout << "Length of the given string is : " << str1L << endl;

        // Taking input Second string

        cout << "Enter Second String to Compare : ";
        gets (str2);
        int str2L = strLength (str2);

        strCom (str1L, str2L);

        copyStr (str1, str2, str2L);

        cout << "First string after reverse : " << revStr(str1, str1L) << endl;
        cout << "Second string after reverse : " << revStr(str2, str2L) << endl;
    }

    // Function to find length of a string

    int strLength (string str) {
        int l = 0;
        for (int i = 0; str[i] != '\0'; i++) {
            l++;
        }
        return l;
    }

    // Function to compare two strings

    void strCom (int str1, int str2) {
        if (str1 == str2) {
            cout << "Length of both Strings are same" << endl;
        } else if (str1 > str2) {
            cout << "Length of First String is greater than Second string" << endl;
        } else {
            cout << "Length of Second String is greater than First string" << endl;
        }
    }

    // Function to copy First string to Second string

    void copyStr (string s1, string s2, int s2L) {

        int s2LI = s2L+1;

        for(int i = 0; s1[i] != '\0'; i++) {

            s2[s2LI] = s1[i];
            s2LI++;
        }

        cout << "String after copying First string to the second string : " << s2 << endl;
    }

    // Function to reverse a string

    string revStr(string str, int strL) {

        for (int i = 0; i < strL/2; i++) {
            swap (str[i], str[strL-i-1]);
        }
        return str;
    }

};

// Driver Code

int main() {

    Strings obj;
}
