#include <bits/stdc++.h>

using namespace std;

vector<string> fizzbuzz(int n)
{
    vector<string> ans;
    for (int i = 1; i <= n; ++i)
    {
        if (i % 3 == 0 && i % 5 == 0)
            ans.push_back("FizzBuzz");
        else if (i % 3 == 0)
            ans.push_back("Fizz");
        else if (i % 5 == 0)
            ans.push_back("Buzz");
    }
    return ans;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    vector<string> ans = fizzbuzz(15);
    for (string e : ans)
    {
        cout << e << " ";
    }
    return 0;
}