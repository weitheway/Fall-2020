""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P3 - define a function called 
    'maxOfThree' that takes three values and 
    returns the maximum value of the three.
"""

def maxOfThree(a,b,c):
    if a>b and a>c or a==b and a>c:
        print("The maximum of "+a+" "+b+" "+c+" is: " + a)
    if b>a and b>c or b==c and b>a:
        print("The maximum of "+a+" "+b+" "+c+" is: " + b)
    if c>a and c>b or c==a and c>b:
        print("The maximum of "+a+" "+b+" "+c+" is: " + c)
    if a==b and b==c:
        print("The maximum of "+a+" "+b+" "+c+" is: " + a)

while(True):
    try:
        a = input("Enter the first number: ")  
        x = float(a)
        b = input("Enter the second number: ")
        y = float(b)
        c = input("Enter the third number: ")
        z = float(c)
        maxOfThree(a,b,c)
    except:
            print("Error detected: Please enter numerical inputs only.")
    
