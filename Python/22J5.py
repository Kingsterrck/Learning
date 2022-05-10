size = int(input())
yard = []
status = True
isTree = False
actualSquareSize = 1
for i in range(size):
    yard.append([])
    for k in range(size):
        yard[i].append(0)

# planting trees
treeNum = int(input())
for i in range(treeNum):
    loc = input()
    locationIndex = loc.split(" ")
    row = int(locationIndex[0])
    col = int(locationIndex[1])
    del yard[row-1][col-1]
    yard[row-1].insert(col-1,1)

for row in range(size-1):
    for col in range(size-1):
        squareSize = 2
        while isTree == False:
            for targetRow in range(row,row+squareSize-1,1):
                for targetCol in range(col,col+squareSize-1,1):
                    if yard[targetRow][targetCol] == 1:#tree planted
                        isTree = True
                        break
            if (isTree == True):
                squareSize -=1
                if squareSize > actualSquareSize:
                    actualSquareSize = squareSize
            else:
                squareSize+=1
print(actualSquareSize-1)
