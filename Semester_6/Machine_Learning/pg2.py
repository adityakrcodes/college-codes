from sklearn.model_selection import train_test_split 
from sklearn.neighbors import KNeighborsClassifier 
from sklearn.datasets import load_iris 
  
iris_dataset = load_iris()
print(iris_dataset["data"]) 
print("\n IRIS FEATURES ",iris_dataset.target_names) 
x_train,x_test,y_train,y_test=train_test_split(iris_dataset["data"],iris_dataset["target"],test_size=1/10) 
kn=KNeighborsClassifier(n_neighbors=7) 
kn.fit(x_train,y_train) 
pred_res = kn.predict(x_test) 
print("\n Actual Result\n",y_test) 
print("\n Predicted Result \n",pred_res) 
print("\n Accuracy: \n",kn.score(x_test,y_test))