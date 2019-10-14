#include <iostream>
#include <vector>
#include <cstring>
#include <algorithm>




using namespace std ;

int a,b;
long long int DP[12][180][2];
vector<int> num;
long long int solve(int pos,int sum,int f){
    if(pos==num.size()){
        return sum;
    }
    if (DP[pos][sum][f]!=-1) return DP[pos][sum][f];
    long long int res=0;
    int lmt;
    if(f==0){
        lmt=num[pos];
    }
    else lmt=9;
    for(int dgt=0;dgt<=lmt;dgt++){
        int nf=f;
        if(f==0 && dgt<lmt) nf=1;
        res+=solve(pos+1,sum+dgt,nf);
    }
    return DP[pos][sum][f]=res;
}

long long int solve1(int no){
    num.clear();
    while(no!=0){
        num.push_back(no%10);
        no/=10;
    }
    memset(DP,-1,sizeof(DP));
    reverse(num.begin(),num.end());
    long long int result=solve(0,0,0);
    return result;
}



int main() {
    int x , y;
    scanf("%d %d",&x , &y);
    cout << solve1(y) - solve1(x-1);
    return 0;
}

