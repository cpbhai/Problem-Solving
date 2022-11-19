#include <bits/stdc++.h>
using namespace std;
//https://codeforces.com/contest/1754/problem/A
#define ff first
#define ss second
#define pb push_back
#define mp make_pair
#define pii pair<int, int>
#define vi vector<int>
#define mii map<int, int>
#define pqb priority_queue<int>
#define pqs priority_queue<int, vi, greater<int>>
#define setbits(x) __builtin_popcount(x)
#define zrobits(x) __builtin_ctz(x)
#define mod 1000000007
#define inf 1e18
#define ps(x, y) fixed << setprecision(y) << x
#define mk(arr, n, type) type *arr = new type[n];
#define w(x)  \
    int x;    \
    cin >> x; \
    while (x--)

void harsh()
{
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(0);
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;
        string s;

        for (int i = 0; i < n; i++)
        {
            char ch;
            cin >> ch;
            s += ch;
        }
        int i = 0;
        while (i < n)
        {
            if (s[i] == 'Q')
            {
                bool flag = false;
                for (int j = i + 1; j < n; j++)
                {
                    if (s[j] == 'A')
                    {
                        s[i] = '0', s[j] = '0';
                        flag = true;
                    }
                    if (flag)
                        break;
                }
            }
            i++;
        }

        bool flag = true;

        for (int i = 0; i < n; i++)
        {
            if (s[i] == 'Q')
            {
                flag = false;
            }
        }

        if (flag)
            cout << "Yes" << endl;
        else
            cout << "No" << endl;
    }
}

int main()
{
    harsh();
    return 0;
}