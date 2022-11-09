/* Define a class to store matrices. Write suitable friend functions to add and multiply two matrices*/

#include <iostream>
using namespace std;

class matrix {

    public:
    int r, c;
    int m[100][100];
    
    // Function for Matrix input
    void getMatrix () {

        cout << "No of rows of matrix : ";
        cin >> r;
        cout << "No of columns of matrix : ";
        cin >> c;
        m[r][c];
        
        for ( int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                cout << "Enter " << i << ", " << j << " element : ";
                cin >> m[i][j];
            }
        }
    }

    //Function to add two matrices
    void addMatrices(matrix m1, matrix m2) {
        int sum[r][c];
        int m1[r][c];
        int m2[r][c];

        for(int i = 0; i < max(m1.r, m2.r); i++) {
            for(int j = 0; j < max(m1.c, m2.c); ++j) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
                
    }

    //Function to multiply two matrices
    int mulMatrices(matrix m1, matrix m2) {


    }

    // Function for Matrix output
    void displayMatrix() {

        for ( int i = 1; i <= m3.r; i++) {
            for (int j = 1; j <= m3.c; j++) {
                cout << m3.m[i][j] << " ";
            }
            cout << endl;
        }
    }

};

//Driver Code
int main() {

    matrix m1, m2, m3;
    m1.getMatrix();
    m2.getMatrix();

    m3.addMatrices(m1, m2);
    m3.displayMatrix();

    m3.mulMatrices(m1, m2);
    m3.displayMatrix();
}
