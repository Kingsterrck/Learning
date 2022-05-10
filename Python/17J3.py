start = int(input())
start = start + 1
# startStore = start
stat = False
while stat == False:
    # start = startStore
    # numList = []
    # while (start != 0):
    #     numList.append(start%10)
    #     start = (start - (start%10))/10
    # for i in range (len(numList)):
    #     for k in range (len(numList)):
    #         if (numList[k] == numList[i] and k!=i):
    #             stat = True
    # stat = not stat
    # startStore = startStore + 1


    # 2
    # listYear = []
    # a = str(start)
    # for i in a:
    #     listYear.append(i)
    # for i in listYear:
    #     if listYear.count(i)>1:
    #         start+= 1
    #         stat = True
    #         break
    # stat = not stat
    # 3
    if len(set(str(start)))< len(str(start)):
        start+=1
    else:
        break
print(start)

