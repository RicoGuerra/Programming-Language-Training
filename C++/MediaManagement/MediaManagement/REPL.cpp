#include <stdio.h>
#include <iostream>
#include "REPL.h"

using namespace std;

void REPL::start()
{
	string greeting = "Welcome to the MediaManagement C++ Version!!";
	string options = "";
	string input = "";
	bool loop = true;

	cout << greeting << endl;

	while (loop)
	{
		cin >> input;
		if (input == "x")
		{
			loop = false;
		}
		else
		{
			cout << input << endl;
		}
	}
}
