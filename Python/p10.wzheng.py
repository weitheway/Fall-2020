""" 
    Author: Wen Wei Zheng
    Course: SSW 540
    Assignment: P10 - Data Visualization

"""
import matplotlib.pyplot as plt
import re 

run = "1"
d = {"Sun":0,"Mon":0,"Tue":0,"Wed":0,"Thu":0,"Fri":0,"Sat":0}
while run == "1":
    # Making sure the input file exists 
    try:
        filename = input("What file would you like to open? ")
        fhand = open(filename)
    except:
        print("Error: File '" +filename+ "' was not found")
        run = input("Press 1 to open another file. Anything else to quit. ")
        continue
    
    # Count # of occurrence for each day
    try:
        for line in fhand:
            line = line.rstrip()
            lst = re.findall("Date: ([a-zA-Z]+),",line)
            if len(lst)>0:
                for day in lst:
                    d[day] += 1
 
    except:
        print("Error Detected.")

    # Bar Graph Output
    plt.bar(range(len(d)), d.values(), align='center')
    plt.xticks(range(len(d)), list(d.keys()))
    plt.title("P10 - Data Visualization")
    plt.xlabel("Day of the Week")
    plt.ylabel("# of Emails Sent")
    plt.show()
    # print(d)
    run = input("Press 1 to input another file. Anything else to quit. ")