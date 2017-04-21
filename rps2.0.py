import random

def RPS():
    print("You are playing Rock Paper Scisscors")
    comp_possible  = 1,2,3
    score = [0,0]
    flag = 0
    while True:
        print("Enter your choice:")
        while True:
            choice = input('->')
            if choice == 'r' or choice == 'R' or choice == 'Rock' or choice == 'rock' or choice == '1':
                choice_identifier  = 1
                break
            elif choice == 'S' or choice == 's' or choice == 'Scissors' or choice == 'sciccors' or choice == '2':
                choice_identifier =  2
                break
            elif choice == 'P' or choice == 'p' or choice == 'Paper' or choice == 'paper' or choice == '3':
                choice_identifier =  3
                break
            else:
                print('That\'s not an option in this game :)')
                print('Try again:')
                continue

        comp_choice = random.choice(comp_possible)
        if (comp_choice==1):
            print("Computer plays Rock")
        elif(comp_choice==2):
            print("Computer plays Scissors");
        else:
            print("Computer plays Paper");

    
        if choice_identifier == comp_choice:
            print("It's a draw!")
            score[0] = score[0] + 1
            score[1] = score[1] + 1
        elif (choice_identifier == 1 and comp_choice == 2) or (choice_identifier == 2 and comp_choice == 3) or (choice_identifier == 3 and comp_choice == 1):
            print('You win!')
            score[0] = score[0] + 1
        else:
            print('You lose...')
            score[1] = score[1] + 1


        while (score[0]<=10 or score[1]<=10):
                print(' Current score: You - ',score[0],' Computer - ',  score[1])
                break
        if(score[0]==10):
                print("You win the GAME");
                break
        elif(score[1]==10):
                print("Computer Wins, sorry Better Luck Next Time");
                break
        else:
            continue
        

RPS()
