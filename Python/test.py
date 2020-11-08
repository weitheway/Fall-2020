""" 
    Author: Wen Wei Zheng
    Course: SSW 540

    Assignment: P8 - Classic Books
The summary should include:

Total words
Total distinct words
The top 25 most frequent words and counts (You do NOT need to handle ties.  Just pick the top 25)
Character frequency sorted from most frequent to least frequent characters
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
    
    d = defaultdict(int)
    alphabetCount = defaultdict(int)
    wordcount = 0
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
                    alphabetCount[cha] +=1

    except:
        print("Error occurred.")

    # File Output
    print("Here's a summary of the file you have selected: ")
    if d != {}:
        print("There were {:,} words.".format(wordcount))
        print("There were {} distinct words.".format(len(d)))
        s = sorted(d.items(),key=itemgetter(1), reverse=True)
        print(s[:25])
        print("\n")
        s1 = sorted(alphabetCount.items(),key=itemgetter(1), reverse=True)
        print(s1)
        print("\n")
    else:
        print("The file you selected is an empty file.")
    run = input("Press 1 to input another file. Anything else to quit. ")