""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P4 - Guess the Number Game
"""

import random

def GuessNumber(x,y):
    ##x is the guess y is the randomly generated number
    if x == y:
        return 0
    elif x > y:
        return 1
    else:
        return -1

number = random.randint(1,20)
count = 0
user = input("Hello! What is your name? ")
print("Let's play a game " + user + "! I am thinking of a number between 1 and 20.")

while count < 6:
    try:
        guess = float(input("Take a guess: "))
        if 1<=guess<=20:
            count+=1
            if GuessNumber(guess,number) == 0:
                print("Good job " +user+"! You guessed my number in "+str(count)+" guesses!")
                break
            elif GuessNumber(guess,number) == 1:
                print("Your guess is too high!")
                
            elif GuessNumber(guess,number) == -1:
                print("Your guess is too low!") 
                
        else:
            print("Your guess not in range. Try again.") 
    except:  
        print("Please make a numeric guess.")

if count >= 6:
    print("The number I was thinking of was " +str(number))