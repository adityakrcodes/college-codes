# Creating an empty tuple
Tuple1 = ()
print("Initial empty tuple")
print(Tuple1)

# Creating a Tuple with the use of string
Tuple2 = ("Chennai", "Delhi")
print("\nTuple with the use of String: ")
print(Tuple2)

# Creating a Tuple with the use of list
list1 = [1,2,4,5,6]
print("\nTuple using list:")
print(tuple(list1))

# Creating a Tuple with the use of built-in function
Tuple3 = tuple('Bengaluru')
print("\nTuple with the use of function: ")
print(Tuple3)

# Printing the Value of Tuples
print("\nFirst element of Tuple: ")
print(Tuple3[0])

#Tuple Unpacking. This line unpack values of Tuple2
a, b = Tuple2
print("\nValues after unpacking")
print(a)
print(b)
