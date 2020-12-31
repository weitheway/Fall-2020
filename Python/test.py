#code to copy

import matplotlib.pyplot as plt         #for ploat histogram of our sample avg
import random

def main():
    sum=0
    avg=[]
    for i in range(1000):                           #1000 times we need this avg
        sum=0
        for i in range(1000):                          #1000 sample
             random_number=random.randint(0,9)
             sum+=random_number
        sample_avg=sum/1000
        avg.append(sample_avg)          #append sample average in avg variable
    print(avg)                             #print average data of sample

    plt.hist(avg)                          #ploat Histogram of avg , so we seethat it folow center limit Theorem.
    plt.xlabel('Avg of Sample')
    plt.ylabel('Frequency of Avg')
    plt.show()

if __name__ == '__main__':
    main()