import numpy as np 
import matplotlib.pyplot as plt 
from sklearn.cluster import KMeans 

data = np.random.randint(0, 80, 50) 
data = data.reshape(-1, 1) 
print(data) 
model = KMeans(n_clusters=4) 
model.fit(data) 
labels = model.labels_ 
centroids = model.cluster_centers_ 
plt.scatter(data, np.zeros_like(data), c=labels, s=50) 
plt.scatter(centroids, np.zeros_like(centroids), c='red', s=100, marker='*') 
plt.xlabel('Data') 
plt.ylabel('Cluster') 
plt.title('K-Means 1D Clustering') 
plt.show()