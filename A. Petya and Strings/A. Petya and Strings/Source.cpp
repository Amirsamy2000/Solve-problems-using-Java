#include<iostream>
#include<string>
using namespace std;
int main() {
	string a;
	string s;
		
	cin >> a >> s;
	for (int i = 0; i < a.length(); i++) {
		a[i] = tolower(a[i]);
		
	}
	for (int i = 0; i < s.length(); i++) {
		
		s[i]=tolower(s[i]);
	}
	//a.compare(s);
	
	
	if (a.compare(s) ==0) {
		cout << "0" << endl;
	}
	else if(a.compare(s) ==1) {
		cout << "1" << endl;

	}
	else {
		cout << "-1" << endl;
	}
	
	return 0;

}