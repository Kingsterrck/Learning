inn = input().split(" ")
realPart = round(float(inn[0]),2)
imgPart = round(float(inn[1]),2)
resList = [[realPart,imgPart]]
resReal = 0.00
resImg = 0.00
stat = False
whatsGoingOn = 0

while (stat == False):
    iterat = len(resList)-1
    tempReal = resList[iterat][0]
    tempImg = resList[iterat][1]

    realSquare = tempReal*tempReal
    imgSquare = tempImg * tempImg

    resReal = realSquare-imgSquare+resList[0][0]
    resImg = 2*tempReal*tempImg + resList[0][1]

    storage = [round(resReal,2),round(resImg,2)]

    abso = abs((resReal*resReal)+(resImg*resImg))

    if (storage in resList):
        stat = True
        whatsGoingOn = 1
    elif (abso >= 16):
        stat = True
        whatsGoingOn = 2
    else:
        resList.append(storage)

if (whatsGoingOn == 1):
    print(len(resList))
elif (whatsGoingOn == 2):
    print("ESCAPES ",end="")
    print(len(resList)+1)