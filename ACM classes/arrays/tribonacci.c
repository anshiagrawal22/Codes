#include <stdio.h>
void main()
{
 int i,n;
 printf("value for n");
 scanf("%d", &n);
 int a[n];
 for(i=0;i<n;i++)
 {
    if (i<3)
    {
        scanf("%d",&a[i]);      
    }
    else{
        a[i]=a[i-1]+a[i-2] + a[i-3];
    }
 }
 for(i=0;i<n;i++)
 {
    printf("%d ",a[i]);
 }
}