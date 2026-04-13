#include<stdio.h>
#include<algorithm>
#include<vector>
using namespace std;

int main() {
    int n, m;
    scanf("%d", &n);
    vector<int> v(n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &v[i]);
    }
    sort(v.begin(), v.end());
    scanf("%d", &m);
    while (m--) {
        int input;
        scanf("%d", &input);
        auto p = equal_range(v.begin(), v.end(), input);
        printf("%d ", (int)(p.second - p.first));
    }
    return 0;
}