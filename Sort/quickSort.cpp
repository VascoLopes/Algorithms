#include <iostream>
#include <vector>
#include <algorithm>
#include "../Utils/vectorUtils.cpp"

using namespace std;

void quickSort(int n[], int low, int high);
int partition(int n[], int low, int high);

int main (){
    int size = readArraySize();
    //array
    int * n = readIntArrayFromSTDIN(size);

    quickSort(n, 0, size);

    printArray(n, size);
    
    return (0);
}

void quickSort(int n[], int low, int high){
    if ( low < high ){
        int pi = partition(n, low, high);

        quickSort(n, low, pi-1);
        quickSort(n, pi+1, high);
    }

}

int partition(int n[], int low, int high){
    int pivot = n[high];

    int i = (low-1);

    for ( int j = low; j<= (high-1); j++ ){
        if ( n[j] <= pivot){
            i++;
            swap(n[i], n[j]);
        }
    }
    i++;
    swap(n[i], n[high]);
    return (i);
}
