# Tower of Hanoi
# AKC

def TowerOfHanoi(number_of_disks , S, I, D):
    if(number_of_disks==1):
        print ("Move disk 1 from source {} to destination {}".format(S,D))
        return
    TowerOfHanoi(number_of_disks-1, S, D, I)
    print ("Move disk {} from source {} to destination {}".format(number_of_disks,S,D))
    TowerOfHanoi(number_of_disks-1, I, S, D)

# Driver code
number_of_disks = int(input("Enter the number of disks: "))
TowerOfHanoi(number_of_disks,'A','B','C')