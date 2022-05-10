size = input().split(" ")
arrayHeight = int(size[0])
arrayWidth = int(size[1])
array1 = []
array2 = []
array3 = []
for i in range(3):
    temp = input().split(" ")
    for k in range(arrayHeight):
        tempRow = []
        for l in range(arrayWidth):
            index = k*arrayWidth + l
            tempRow.append(temp[index])
        if i == 0:
            array1.append(tempRow)
        elif i == 1:
            array2.append(tempRow)
        elif i == 2:
            array3.append(tempRow)
print(array2)