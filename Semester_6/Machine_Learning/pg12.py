import pandas as pd 
from sklearn.ensemble import RandomForestRegressor 
from sklearn.tree import plot_tree
df= pd.read_csv('./dataset/suv_data.csv') 
print(df.head(10)) 
X = df.iloc[:,1:2].values #features 
y = df.iloc[:,2].values # Target variable 
#print(X) 
#print(y) 
from sklearn.preprocessing import LabelEncoder 
#Check for and handle categorical variables 
label_encoder = LabelEncoder() 
x_categorical = df.select_dtypes(include=['object']).apply(label_encoder.fit_transform)
x_numerical = df.select_dtypes(exclude=['object']).values
x = pd.concat([pd.DataFrame(x_numerical), x_categorical], axis=1).values
#print(x) 
# Fitting Random Forest Regression to the dataset 
regressor = RandomForestRegressor(n_estimators=100, random_state=0,  oob_score=True) 
# Fit the regressor with x and y data 
regressor.fit(x, y) 
# Assuming regressor is your trained Random Forest model # Pick one tree from the forest, e.g., the first tree (index 0) from sklearn.tree import plot_tree 
import matplotlib.pyplot as plt 
tree_to_plot = regressor.estimators_[0] 
# Plot the decision tree 
plt.figure(figsize=(20, 10))  
plot_tree(tree_to_plot, feature_names=df.columns.tolist(), filled=True,  rounded=True, fontsize=10) 
plt.title("Decision Tree from Random Forest") 
plt.show()