#include <iostream>
#include <vector>
#include <algorithm>
#include "../Utils/vectorUtils.cpp"

using namespace std;

int binarySearch(vector<int> n, int l, int r, int x);

int main (){
    //Read input search
    int searchFor = 0;
    scanf("%d", &searchFor);

    vector<int> n = readIntVectorFromSTDIN(); //Utils file readVector (size, (number)^size)
    
    sort(n.begin(), n.end());

    int index = binarySearch(n, 0, n.size(), searchFor);
    cout << "The number: " << searchFor << " is at index: " << index << endl;

    return (0);
}

//Binary search
//N: Vector
//L: first index
//R: last index
//X: to search for
int binarySearch(vector<int> n, int l, int r, int x){
    if (r >= l){ //
        int mid = l + ( r - l ) / 2;
        
        if( n[mid] == x )
            return (mid);

        else if( n[mid] <= x ){
            return binarySearch(n, mid+1, r, x); //search in the right subarray
        }
        return binarySearch(n, l, mid-1, x); //search in left subarray        
    }
    return (-1);
}