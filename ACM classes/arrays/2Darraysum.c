#include<stdio.h>
void main()
{
    int ar1[2][2], ar2[2][2], c[2][2];
    int i,j;
    printf("enter the values for first matrix");
    for (i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
        scanf("%d", &ar1[i][j]);
        }
    }
    printf("enter the values for second matrix");
    for (i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
        scanf("%d", &ar2[i][j]);
        }
    }
    for (i=0; i<2;i++) //summation of two matrix
    {
        for (j=0; j<2; j++)
        {
            c[i][j]=ar1[i][j] + ar2 [i][j];
        }
    }
    for (i=0; i<2;i++) //printing summation of two matrix
    {
        for (j=0; j<2;j++)
        {
            printf("%d\t",c[i][j]);
        }
        printf("\n");
    
    }

}
