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
        print("File " +filename+ " was not found")
        run = input("Press 1 to open another file. Anything else to quit. ")
        continue
    
    d = dict()
    email = []

    try:
        for line in fhand:
            if line.startswith("From:"):
                words = line.split()
                # if len(words)==0:
                #     continue
                email.append(words.pop(1))
                for unique in email:
                    d[unique]=d.get(unique,0)+1
    except:
        print("Nothing was found in the file.")
    print(email)
    # MOST_EMAIL_ADDRESS=max(d,key=d.get)
    # print(MOST_EMAIL_ADDRESS,d[MOST_EMAIL_ADDRESS])