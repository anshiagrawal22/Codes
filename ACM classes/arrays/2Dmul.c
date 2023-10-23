#include<stdio.h>
void main()
{
    int a,b,c,d;
    int i,j;
    printf("enter row and column of 1 matrix");
    scanf("%d",&a);
    scanf("%d",&b);
    printf("enter row and column of 2 matrix");
    scanf("%d",&c);
    scanf("%d",&d);
    int  A[a][b], B[c][d],C[][];
    if (b==c)
    {
        printf("enter values for 1 matrix");
    for (i=0;i<a;i++)  
    {
        for(j=0;j<b;j++)
        {
            scanf("%d",A[i][j]);
        }
    }
    printf("enter values for 2 matrix");
     for (i=0;i<c;i++)
    {
        for(j=0;j<d;j++)
        {
            scanf("%d",B[i][j]);
        }
    }
    for (i=0;i<a;i++)
    {
        for (j=0;j<d;j++)
        {  
            for(k=0)
            C[i][j]= A[i][j]*B[i][j] + A[i]  
        }
    }
    for (i=0;i<a;i++) //printing of multiplication of two loops
    {
        for (j=0;j<d;j++)
        {
            printf("%d\t",C[i][j]);
        }
        printf("\n");
    } 
    }
    else{
        printf ("not vaild rows and coloumns");
    }
}