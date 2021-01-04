#include<stdio.h>
int main()
{
	int i,Number,count;
	printf("\n Prime number from 1 to 100 are   \n");
	for(Number=1; Number<=100;Number++) //here for loop start
	{
		count=0;
		for(i=2;i<=Number/2;i++) 
		{
			if(Number%i==0)
			{
				count++;
				break;
				
			}
		}
		if(count==0 && Number !=1)
		{
			printf("%d\t",Number);
		}
	}
	return 0;
}
