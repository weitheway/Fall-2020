""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P2 - Convert Numeric Scores to Grades
    Description: Write a script that asks the user for 
    a quiz score and converts that numeric score to a 
    letter grade.
"""

score = input("Enter Score: ")
try:
    grade = float(score)
    if grade<0 or grade>100:
        print("Error detected: Please enter a score between 0 and 100.")
    elif grade > 92:
        print("Final Grade: A")
    elif grade <= 92 and grade >= 90:
        print("Final Grade: A-")
    elif grade <= 89 and grade >= 87:
        print("Final Grade: B+")
    elif grade <= 86 and grade >= 83:
        print("Final Grade: B")
    elif grade <= 82 and grade >= 80:
        print("Final Grade: B-")
    elif grade <= 79 and grade >= 70:
        print("Final Grade: C")
    elif grade < 70:
        print("Final Grade: F")
except:
    print("Error detected: Please input a numerical number.")