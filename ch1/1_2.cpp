#include <iostream>
using namespace std;

void reverse(char* str);

int main(){
    string a = "hey";
    a[1] = 'b';
    cout << a << endl;
    char cStr [] = "a b c hello";
    reverse(cStr);
    cout << cStr << endl;
    return 0;
}

void reverse(char* str){
    char * start = str;
    char * end = start;
    int strLen = 0;
    while(*end != '\0'){
        end++;
        strLen++;
    }
    end--;

    int idxCount = 1;

    while(idxCount <= (strLen / 2)){
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
        idxCount++;
    }

}