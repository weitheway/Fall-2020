""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P5 - String Manipulation

"""

def plural(s):
    words = s
    for i in range(len(words)):
        if words[i].endswith(('ay','ey','iy','oy','uy')):
            words[i] = words[i] + "s"
        elif words[i].endswith('y'):
            words[i] = words[i][:-1] + "ies"
        elif words[i].endswith(('o','ch','s','sh','x','z')):
            words[i] = words[i] + "es"
        else:
            words[i] = words[i] + "s"
    return words
repeat = "1"
while repeat == "1":
    line = input("Please input words separated by a space: ")
    lines = line.split(" ")
    pline = " ".join(plural(lines))
    print(pline)
    repeat = input("Press 1 to input another set of words. 0 to quit.")