""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P9 - Using Regular Expressions
Write and submit a script that asks for a filename (to which mbox.txt and mbox-short.txt will be used) and looks for lines of the form

New Revision: 39772

Extract the number from each of the lines using a regular expression and the findall() method. 
Compute the average of the numbers, rounded to a single decimal place, and print out the average and the number of lines used for the computation.

Enter filename: mbox.txt

Average = 38549.8

Number of lines = 1790
"""

import re 

run = "1"

while run == "1":
    # Making sure the input file exists 
    try:
        filename = input("What file would you like to open? ")
        fhand = open(filename)
    except:
        print("Error: File '" +filename+ "' was not found")
        run = input("Press 1 to open another file. Anything else to quit. ")
        continue
    revLine = 0
    sum = 0
    values =[]
    try:
        for line in fhand:
            line = line.rstrip()
            lst = re.findall("^New Revision: ([0-9]+)",line)
            if len(lst)>0:
                revLine+=1
                values.append(lst[0])
        avg = [float(x) for x in values]
        for val in avg:
            sum+=val
        AVERAGE = sum/len(avg)            
    except:
        print("Error detected")
    # File Output 
    print("Average = {}".format(round(AVERAGE,1)))
    print("Number of lines = {}".format(revLine))
    run = input("Press 1 to input another file. Anything else to quit. ")