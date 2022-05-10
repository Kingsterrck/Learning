inputString = input()
stringList = []
tempSym = ""
tempSym2 = ""
tempNum = ""
numStat = False
length = len(inputString)
currentRuntime = 0
for i in (inputString):
    stringList.append(i)
for i in range(len(stringList)):
    current = stringList[i]
    if current=="+" or current=="-":
        tempSym2 = current
    elif current=="0" or current=="1" or current=="2" or current=="3" or current=="4" or current=="5" or current=="6" or current=="7" or current=="8" or current=="9":
        if currentRuntime == length-1:
            print(tempSym,end=" ")
            if tempSym2 == "+":
                print("tighten",end=" ")
            else:
                print("loosen", end=" ")
            print(tempNum)
            tempSym = ""
            numStat = False
            tempSym+=stringList[i]
        elif (numStat == False):#first number
            tempNum = str(current)
            numStat = True
        else:
           tempNum +=str(current)
    else: 
        if (numStat == True):
            print(tempSym,end=" ")
            if tempSym2 == "+":
                print("tighten",end=" ")
            else:
                print("loosen", end=" ")
            print(tempNum)
            tempSym = ""
            numStat = False
            tempSym+=stringList[i]
        else:
            tempSym+=stringList[i]
    currentRuntime+=1