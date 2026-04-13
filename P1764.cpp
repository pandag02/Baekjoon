#include <set>
#include <vector>
#include <string>
#include <algorithm>
#include <stdio.h>
using namespace std;

int main() {
    int n, m;
    scanf("%d %d", &n, &m);

    set<string> s;
    vector<string> result;

    for(int i = 0; i < n; i++) {
        string name;
        scanf("%s", &name[0]);
        s.insert(name);
    }

    for(int i = 0; i < m; i++) {
        string name;
        scanf("%s", &name[0]);
        if(s.count(name)) {
            result.push_back(name);
        }
    }

    sort(result.begin(), result.end());

    printf("%d\n", (int)result.size());
    for(auto &name : result) {
        printf("%s\n", name.c_str());
    }
}