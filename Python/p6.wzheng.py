""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P6 - Slicing and Dicing Files

"""
run = "1"

while run == "1":
    count=0
    SPAM_Total=0
    try:
        filename = input("What file would you like to open? ")
        fhand = open(filename)
    except:
        print("File " +filename+ " was not found")
        run = input("Press 1 to open another file. Anything else to quit. ")
        continue
    try:
        for line in fhand:
            if line.startswith("X-DSPAM-Confidence:"):
                newline = line.strip()
                count = count + 1
                cpos = line.find(":")
                num = newline[cpos+1:]
                spam = float(num)
                SPAM_Total = SPAM_Total + spam
        spamavg = SPAM_Total/count
    except:
        print("Error detected: Cannot calculate average spam confidence.")
        run = input("Press 1 to open another file. Anything else to quit. ")
        continue
    print("Average spam confidence: {0:.4f}".format(spamavg))
    run = input("Press 1 to open another file. Anything else to quit. ")