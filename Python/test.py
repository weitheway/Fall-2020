

def maxOfThree():
    try:
        a = input("Enter the first number: ")  
        x = float(a)
        b = input("Enter the second number: ")
        y = float(b)
        c = input("Enter the third number: ")
        z = float(c)
        if a>b and a>c or a==b and a>c:
            print("The maximum of "+a+" "+b+" "+c+" is: " + a)
        if b>a and b>c or b==c and b>a:
            print("The maximum of "+a+" "+b+" "+c+" is: " + b)
        if c>a and c>b or c==a and c>b:
            print("The maximum of "+a+" "+b+" "+c+" is: " + c)
    except:
        print("Error detected: Please enter numerical inputs only.")

for x in range(0,10):
    maxOfThree()
    
