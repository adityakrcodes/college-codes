import pandas as pd 
from sklearn.model_selection import train_test_split 
from sklearn.linear_model import LinearRegression 
data = pd.read_csv('./dataset/weight-height.csv') 
print (data) 
height_x=data.iloc[:,:-1] 
weight_y=data.iloc[:,1] 
train_height,test_height,train_weight,test_weight=train_test_split(height_x,weight_y,test_size=1/6) 
#data for training 
model = LinearRegression() 
model.fit(train_height,train_weight)  
#predictions
pred_res = model.predict(test_height) 
print(test_height) 
print(test_weight) 
print(pred_res) 
print(" Accuracy :", model.score(test_height,test_weight))
