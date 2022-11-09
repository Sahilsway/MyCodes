
#include<iostream>
using namespace std;

class time {

    int x;
    int H = getHour();
    int M = getMint();
    int S = getSec();

    public:
    time() {

        display (H, M, S);

        //******************Don't Write the code BELOW*********************

        // cout << "Enter '0' if you want to decrease your time by 1 second \n Enter '1' if you want to increase your time by 1 second \n";
        // cin >> x;
        // if ( x == 0) {
        //     op();
        // } else if (x == 1) {
        //     op(x);
        // } else {
        //     cout << "You have entered wrong value";
        // }

        //******************Don't Write the code ABOVE*********************

    }

    // Function to validate hour
    int getHour() {
        int hour;

        cout << "Enter hour : ";
        cin >> hour;

        if (hour > 12 || hour < 0) {
            cout << "Hour should be between 1 to 12 \n You have only one chance left : ";
            cin >> hour;
            if (hour > 12 || hour < 0) {
                cout << "You have entered invalid hour" << endl;
                return 0;
            }
        }
        return hour;
    }

    // Function to validate minute 
    int getMint() {
        int mint;

        cout << "Enter minute : ";
        cin >> mint;

        if (mint < 0 || mint > 59) {
            cout << "Minute should be between 0 to 60 \n You have only one chance left : ";
            cin >> mint;
            if (mint < 0 || mint > 59) {
                cout << "You have entered invalid minute" << endl;
                return 0;
            }
        }
        return mint;
    }

    // Function to validate second
    int getSec() {
        int sec;
        cout << "Enter second : ";
        cin >> sec;

        if (sec < 0 || sec > 59) {
            cout << "Second should be between 0 to 60 \n You have only one chance left : ";
            cin >> sec;
            if (sec < 0 || sec > 59) {
                cout << "You have entered invalid second" << endl;
                return 0;
            }
        }
        return sec;
    }

    

    // Function to display standard time
    void display (int h, int m, int s) {

        cout << "Your Standard Time is : " << h << " : " << m << " : " << s << endl;
    }

    //******************Don't Write the code BELOW*********************

    // // Function for operator overloading
    // void op () {
    //     int h = H;
    //     int m = M;
    //     int s = S;

    //     if (s == 0 && m == 0) {
    //         if (h == 1) {
    //             h = 12;
    //         } else {
    //             h = h-1;
    //         }
    //         m = 59;
    //         s = 59;
    //         cout << "After incrementing \n";
    //         display(h, m , s);
    //     } else if (s == 0) {
    //         h = h;
    //         m = m-1;
    //         s = 59;
    //         cout << "After incrementing \n";
    //         display(h, m , s);
    //     } 
    // }

    // // Function for operator overloading
    // void op (int x) {
    //     int h = H;
    //     int m = M;
    //     int s = S;

    //     if (s == 59 && m == 59) {
    //         if (h == 12) {
    //             h = 1;
    //         } else {
    //             h = h+1;
    //         }
    //         m = 0;
    //         s = 0;
    //         cout << "After incrementing \n";
    //         display(h, m , s);
    //     } else if (s == 59) {
    //         h = h;
    //         m = m+1;
    //         s = 0;
    //         cout << "After incrementing \n";
    //         display(h, m , s);
    //     } 
    // }

    //******************Don't Write the code ABOVE*********************

};

int main() {

    time obj;
    
}