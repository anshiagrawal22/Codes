#include <stdio.h>
int main()
{   int i,j;
    int a,b;
    printf("enter value of a and b:");
    scanf("%d",&a);
    scanf("%d",&b);
    int ar[a][b];
    printf("enter values :");  //array matrix value
    for (i=0;i<a; i++)
    {
        for(j=0;j<b;j++)
        {
            scanf("%d",&ar[i][j]);
        }

    }
       for (i=0;i<a; i++)
    {
        for(j=0;j<b;j++)
        {
            printf("%d\t",ar[i][j]);
        }
       printf ("\n");  //for printing in next line
    }
return 0;

}
