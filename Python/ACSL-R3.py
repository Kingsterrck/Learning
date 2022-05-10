targetSum = int(input())
pascal = [[1],[1,1]]
currentSum = 0
numRows = 2
sumIsSet = False
while sumIsSet == False:
    tempRow = []
    tempRow.append(1)
    for i in range (1,numRows,1):
        tempNum = pascal[numRows-1][i-1] + pascal[numRows-1][i]
        tempRow.append(tempNum)
    tempRow.append(1)
    pascal.append(tempRow)
    rowNum = numRows
    colNum = 0
    hit1 = False
    numList = []
    currentSum = 0
    while hit1 == False:
        takingNumber = pascal[rowNum][colNum]
        if (takingNumber == 1 and colNum != 0) or (rowNum - colNum == 1):
            currentSum += takingNumber
            numList.append(takingNumber)
            hit1 = True
        else:
            currentSum += takingNumber
            numList.append(takingNumber)
            rowNum-=1
            colNum+=1
        
    if currentSum == targetSum:
        sumIsSet = True
    else:
        numRows+=1    
numOfOdd = 0
numOfEven = 0
for i in numList:
    if i % 2 == 0:
        numOfEven+=1
    else:
        numOfOdd+=1
print(numOfOdd, end=" ")
print(numOfEven, end=" ")
print(max(numList))