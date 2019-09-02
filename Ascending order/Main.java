#include<bits/stdc++.h>
using namespace std;
void sort(int n,int *a)
{
sort(a,a+n);
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
	cin>>a[i];
  }
  sort(n,a);
  cout<<"Sorted array is:"<<endl;;
  for(int i=0;i<n;i++)
	cout<<a[i]<<endl;;
  return 0;
}