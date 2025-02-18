import numpy as np 
import pandas as pd 
import csv 
from pgmpy.estimators import MaximumLikelihoodEstimator 
from pgmpy.models import BayesianModel 
from pgmpy.inference import VariableElimination 
hD = pd.read_csv('./dataset/heart.csv') 
hD = hD.replace('?',np.nan) 
print('Sample instances from the dataset are (hD - Heart Disease):') 
print(hD.head()) 
print('\n Attributes and datatypes') 
print(hD.dtypes) 
model = BayesianModel([
    ('age', 'hD'),
    ('sex', 'hD'),
    ('exang', 'hD'),
    ('cp', 'hD'),  # Corrected 'c p' to 'cp'
    ('hD', 'restecg'),
    ('hD', 'chol')
])
model.fit(hD,estimator=MaximumLikelihoodEstimator) 
print('\n Inferencing with Bayesian Network:') 
hDtest_infer = VariableElimination(model) 
print('\n 1. Probability of HeartDisease given evidence= restecg') 
q1=hDtest_infer.query(variables=['hD'],evidence={'restecg':1}) 
print(q1) 
print('\n 2. Probability of HeartDisease given evidence= cp ')
q2=hDtest_infer.query(variables=['hD'],evidence={'cp':2}) 
print(q2)
