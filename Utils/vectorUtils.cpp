#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> readIntVectorFromSTDIN(){
    //Read array size 
    int size = 0;
    scanf("%d", &size);
    vector<int> n(size, 0);

    //Read Array
    for(int i = 0; i < size; i++){   
        scanf("%d", &n[i]);
    }

    return (n);
}

int * readIntArrayFromSTDIN(int size){
    int *n = new int[size] ;

    //Read Array
    for(int i = 0; i < size; i++){   
        scanf("%d", &n[i]);
    }

    return (n);
}

int readArraySize(){
    //Read array size 
    int size = 0;
    scanf("%d", &size);

    return (size);
}

void printIntVector(vector<int> n) { 
    int i;
    int size = n.size(); 
    for (i=0; i < size; i++) 
        printf("%d ", n[i]); 
} 

void printArray(int n[], int size){
    for (int i=0; i < size; i++) 
        printf("%d ", n[i]);
}