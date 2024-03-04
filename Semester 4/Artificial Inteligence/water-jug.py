# Waterjug Problem
# AKC

from collections import defaultdict
jug1, jug2, aim = 4,3,2

visited = defaultdict(lambda:False)

def waterjugsolver(x,y):
    if(x==aim and y==0) or (y==aim and x==0):
        print(x,y)
        return True
    
    if(visited[(x,y)])==False:
        print(x,y)
        visited[(x,y)]=True
        return (waterjugsolver(0,y) or\
                waterjugsolver(x,0) or\
                waterjugsolver(jug1,y) or\
                waterjugsolver(x,jug2) or\
                waterjugsolver(x+min(y,jug1-x),y-min(y,jug1-x)) or\
                waterjugsolver(x-min(x,jug2-y),y+min(x,jug2-y)))
    else:
        return False
    
print('Steps: ')
waterjugsolver(0,0)