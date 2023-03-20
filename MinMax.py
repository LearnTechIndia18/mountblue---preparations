import math
import os
import random
import re
import sys

def miniMaxSum(arr):
    l1=[]
    for i in arr:
        x=-i
        for j in arr:
            x+=j
        l1.append(x)
    print(min(l1),max(l1))    
        

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)