class FiveDivisionError(Exception):
    pass
try:
       n1=int(input("Enter first number:"))
       n2=int(input("Enter second number:"))
       if(n2==5):
           raise FiveDivisionError("cannot divide by five")
       div=n1/n2
       print("division is:",div)
except (FiveDivisionError,ZeroDivisionError) as var:
    print(var)
