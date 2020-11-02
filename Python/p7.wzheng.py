""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P7 - Finding and Counting Unique Items

"""

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
    
    # Adds unique email to a dictionary
    d = dict()
    try:
        for line in fhand:
            if line.startswith("From:"):
                words = line.split()
                words.remove("From:")
                for unique in words:
                    if unique not in d:
                        d[unique] = 1
                    else:
                        d[unique] += 1
    except:
        print("Error: ")

    # File Output
    if d != {}:
        #Prints the requested information if it exists
        MOST_MESSAGE = max(d,key =d.get)
        print("There were {} unique senders with ".format(len(d))+ MOST_MESSAGE + " sending the most emails at {} email messages.".format(d[MOST_MESSAGE]))
    else:
        print("The file you selected is either an empty file or it does not have relevant 'From:' lines.")
    run = input("Press 1 to input another file. Anything else to quit. ")