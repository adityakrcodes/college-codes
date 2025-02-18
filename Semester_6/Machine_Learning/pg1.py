import pandas as pd
import numpy as np
 
data = pd.read_csv("./dataset/dataset-pg1.csv")
print(data)
 
d = np.array(data)[:,:-1]
print("The attributes are: \n",d)
 
target = np.array(data)[:,-1]
print("The target is: ",target)
 
def train(c,t):
    for i, val in enumerate(t):
        if val == "Yes":
            specific_hypothesis = c[i].copy()
            break
             
    for i, val in enumerate(c):
        if t[i] == "Yes":
            for x in range(len(specific_hypothesis)):
                if val[x] != specific_hypothesis[x]:
                    specific_hypothesis[x] = '?'
                else:
                    pass
                 
    return specific_hypothesis
 
print("The final hypothesis is:",train(d,target))
