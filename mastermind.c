#include<stdio.h>
#include<time.h>
#include<string.h>
#include<stdlib.h>
char seq_all[7]={'r','y','g','i','o','v'};
int i;
char seq_guess[4],char_guess[40],guess=' ', feedback1[4];

//function to get user input
int user_input()
{
	printf("Enter 4 colors\n");
	fgets(char_guess,sizeof(char_guess),stdin);
	feedback(char_guess);
	
}

//function to generate feedback
int feedback(char* char_guess)
{
	int j;
	for(i=0;i<4;i++)
	{	
		feedback1[i]=' ';
	}
	for(i=0;i<4;i++)
	{	
		for(j=0;j<4;j++)
		{
			if(char_guess[i]==seq_guess[j])//same color 
				{
				if(i==j)					
					feedback1[j]='b';
				else if(i!=j)
					feedback1[j]='w';
				else
					feedback1[j]=' ';	
				}
		}
	}
}

int main()
{
	int chance=12;
	int random=0;
	srand((unsigned int) time(NULL));
	random=rand()%5;	
	seq_guess[0]=seq_all[random];
	random=rand()%5;
	seq_guess[1]=seq_all[random];
	random=rand()%5;
	seq_guess[2]=seq_all[random];
	random=rand()%5;
	seq_guess[3]=seq_all[random];
	printf("Welcome to Mastermind!\n");
	for(chance=12;chance>=0;chance--)
	{
		user_input();
		printf("Chances remaining: %d\n",chance);
		printf("The feedback is :\n");
		printf("%s\n",feedback1); 
		if(feedback1[0]=='b'&&feedback1[1]=='b'&&feedback1[2]=='b'&&feedback1[3]=='b')		
			break;		
		if(chance==0)
			break;
	}
	printf("The sequence was:");
	printf("%c%c%c%c\n",seq_guess[0],seq_guess[1],seq_guess[2],seq_guess[3]);
	return 0;
}
