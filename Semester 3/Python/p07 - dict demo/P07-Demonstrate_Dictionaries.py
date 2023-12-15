# Demo for all Dictionary Methods
dict1 = {
        1: "Python",
        2: "Java",
        3: "Ruby",
        4: "Scala"
}

# copy() method
dict2 = dict1.copy()
print(dict2)

# clear() method
dict1.clear()
print(dict1)

# get() method
print(dict2.get(1))

# items() method
print(dict2.items())

# Keys() method
print(dict2.keys())

# pop() method
dict2.pop(2)
print(dict2)

# popitem() method
dict2.popitem()
print(dict2)

# update method
dict2.update({3: "Scala"})
print(dict2)

# Values() method
print(dict2.values())
