a = input().split()
leng = int(a[0])
while (leng != 0):
    diffList = []
    verifyDiffList = []
    printStat = False
    for i in range (1,len(a)-1):
        tempDiff = int(a[i+1])-int(a[i])
        if (tempDiff not in diffList):
            diffList.append(tempDiff)
        else:
            verifyDiffList.append(tempDiff)
            if (verifyDiffList == diffList):
                
                                    


            print(len(diffList))
            printStat = True
            break
    if (printStat == False):
        print(len(diffList))
    a = input().split()
    leng = int(a[0])