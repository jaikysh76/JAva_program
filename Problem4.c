#include <stdio.h>

int main()
{
    int number[30];
 
        int a,i,j, n;
        printf("Enter the value of N\n");
        scanf("%d", &n);
 
        printf("Enter the numbers \n");
        for ( i = 0; i < n; ++i)
	        scanf("%d", &number[i]);
        
        //Descending sorting order
        for (i = 0; i < n; ++i) 
        {
            for ( j = i + 1; j < n; ++j) 
            {
                if (number[i] < number[j]) 
                {
                    a = number[i];
                    number[i] = number[j];
                    number[j] = a;
                }
            }
        }
        //Printing Descending order array
        printf("\n\nDescending : ");
 
        for (i = 0; i < n; ++i) 
        {
            printf("%d\n", number[i]);
        }
        
        //Ascending sorting order
        for ( i = 0; i < n; i++)                     
	{
		for ( j = 0; j < n; j++)             
		{
			if (number[j] > number[i])                
			{
				int tmp = number[i];         
				number[i] = number[j];            
				number[j] = tmp;
			}  
		}
	}
	
	//Ascending sorting order
	printf("\n\nAscending : ");                     
	for ( i = 0; i < n; i++)                    
	{
		printf(" %d ", number[i]);
	}

    return 0;
}
