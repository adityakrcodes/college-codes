import pandas as pd
from sklearn import tree
from sklearn.preprocessing import LabelEncoder
from sklearn.naive_bayes import GaussianNB
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score

data = pd.read_csv('./dataset/dataset-pg3.csv')
print("The Values of data is :\n", data)

X = data.iloc[:, :-1]  # All columns except the last
y = data.iloc[:, -1]   # Last column

print("\nThe First 5 values of the train data is\n", X.head())
print("\nThe First 5 values of the train output is\n", y.head())

X.columns = X.columns.str.strip()

print("\nData types of the features:\n", X.dtypes)

categorical_columns = ['Outlook', 'Temperature', 'Humidity', 'Windy']
le = LabelEncoder()

for column in categorical_columns:
    if column in X.columns:
        X[column] = le.fit_transform(X[column])
    else:
        print(f"Column '{column}' not found.")

print("\nNow the Train data is\n", X.head())

y = le.fit_transform(y)
print("\nNow the Train output is\n", y)

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.20, random_state=42)

classifier = GaussianNB()
classifier.fit(X_train, y_train)

accuracy = accuracy_score(classifier.predict(X_test), y_test)
print("Accuracy is:", accuracy)
