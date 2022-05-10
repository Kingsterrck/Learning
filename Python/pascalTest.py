#row = int(input())
pascal = [[1],[1,1]]
numRows = 2
sumIsSet = False
for k in range(5):
    tempRow = []
    tempRow.append(1)
    for i in range (1,numRows-1,1):
        tempNum = pascal[numRows-1][i-1] + pascal[numRows-1][i]
        tempRow.append(tempNum)
    tempRow.append(1)
    pascal.append(tempRow)
    numRows+=1
print(pascal)