#include <iostream>
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
#include <unordered_map>
#include <iostream>

using namespace std;

int main()
{
  int cases;
  cout << "Enter how many cases would you like to test: ";
  scanf("%d", &cases);
  getchar();
  int b = 1;

   cout << " " << endl;

  while (cases--) {

    unordered_map<string, int> mp;
    cout << "Case #" << b++ << ": ";
    string s;
    getline(cin, s);
    int n = s.size();

    for (int len = 1; len < n; ++len) {
      for (int i = 0; i <= n - len; ++i) {
        string t = s.substr(i, len);
        sort(t.begin(), t.end());
        mp[t]++;
      }
    }
    long long ans = 0;
    for (auto t : mp) {
      ans += (long long)t.second * (t.second - 1) / 2;
    }
    cout << "Number of anagrams: ";
    printf("%lld\n", ans);
    cout << " " << endl;
  }

    return 0;
}
