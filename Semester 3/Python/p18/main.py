from collections import Counter
num = list(map(int,input("Enter the numbers:").split()))
n = len(num)
sum = sum(num)
mean = sum / n
print("Mean is: ", mean)
num.sort()
if n % 2 == 0:
    median1 = num[n//2]
    median2 = num[n//2 - 1]
    median = (median1 + median2)/2
else:
    median = num[n//2]
    print("Median is: ", median)
data = Counter(num)
get_mode = dict(data)
mode = [k for k, v in get_mode.items() if v ==
max(list(data.values()))]
if len(mode) == n:
    get_mode = "No mode found"
else:
    get_mode = "Mode is/are: " + ', '.join(map(str, mode))
    print(get_mode)