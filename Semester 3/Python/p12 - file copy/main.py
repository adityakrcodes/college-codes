print("Enter the name of the source file: ")
sFile = input()
print("Enter the name of the destination file: ")
tFile = input()

fileHandle = open(sFile, "r")
texts = fileHandle.readlines()
fileHandle.close()

fileHandle = open(tFile, "w")
for s in texts:
    fileHandle.write(s)
fileHandle.close()
print('\nFile Copied Successfully')