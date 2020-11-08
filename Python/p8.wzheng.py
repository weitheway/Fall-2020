""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P8 - Classic Books
"""

from string import punctuation
from operator import itemgetter
from collections import defaultdict
 
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
    
    # Declaring the variables
    wordcount = 0
    d = defaultdict(int)
    charFreq = defaultdict(int)
    
    #Removes punctuation from each line first
    #Lowercase each line
    #Split each line 
    #Increment wordcount for each word
    #Use the dict to count words
    #Use another dict to count each character
    try:
        for line in fhand:
            punc_translator = line.maketrans({key: None for key in punctuation})
            cleanString = line.translate(punc_translator)
            words = cleanString.lower()
            words = words.split()
            for word in words:
                wordcount +=1
                d[word] +=1
                for cha in word:
                    charFreq[cha] +=1
    except:
        print("Error detected")

    # File Output
    print("\nHere's a summary of the file you have selected: \n")
    if d != {}:
        print("There are {:,} total words with {} distinct words in this file.\n".format(wordcount,len(d)))
        ws = sorted(d.items(),key=itemgetter(1), reverse=True)
        print("The top 25 frequent words and their frequency are as follows: ")
        print(ws[:25])
        print("\n")
        cs = sorted(charFreq.items(),key=itemgetter(1), reverse=True)
        print("The most frequently used characters to least frequently used characters are as follows: ")
        print(cs)
        print("Note: Any letter not shown above was not used in this file.\n")
    else:
        print("The file you selected is an empty file.")
    run = input("Press 1 to input another file. Anything else to quit. ")