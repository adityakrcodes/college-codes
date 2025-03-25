import numpy as np  
import matplotlib as plt 
import pandas as pd  
from sklearn.model_selection import train_test_split 
from sklearn.linear_model import LogisticRegression 
# Read data set 
df = pd.read_csv("./dataset/suv_data.csv")  
print(df.head(10))
x=df.iloc[:,[2,3]].values 
y=df.iloc[:,4].values 
x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.15)
logmodel=LogisticRegression() 
logmodel.fit(x_train,y_train) 
pred_res = logmodel.predict(x_test) 
print("\n Actual Result",y_test) 
print("\n Predicted Result",pred_res) 
print("\nAccuracy",logmodel.score(x_test,y_test))