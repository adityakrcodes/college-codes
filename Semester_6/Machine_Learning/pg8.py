import matplotlib.pyplot as plt  
import matplotlib
matplotlib.use('TkAgg')
from sklearn import datasets  
import pandas as pd 
import numpy as np 
from sklearn import preprocessing 
from sklearn.mixture import GaussianMixture  
iris = datasets.load_iris()
X = pd.DataFrame(iris.data) 
X.columns = ['Sepal_Length','Sepal_Width','Petal_Length','Petal_Width'] 
y = pd.DataFrame(iris.target) 
y.columns = ['Targets'] 
colormap = np.array(['red', 'lime', 'black']) 
gmm = GaussianMixture(n_components=40)  
gmm.fit(X) 
plt.subplot(1, 3, 3) 
plt.scatter(X.Petal_Length, X.Petal_Width, c=colormap[y.Targets], s=40) 
plt.title('GMM Clustering') 
plt.xlabel('Petal Length')  
plt.ylabel('Petal Width') 
plt.show()