currentPosition = [0,-1]
currentStatus = True
status = True
positionList = [[0,-1],[0,-2],[0,-3],[1,-3],[2,-3],[3,-3],[3,-4],[3,-5],[4,-5],[5,-5],[5,-4],[5,-3],[6,-3],[7,-3],[7,-4],[7,-5],[7,-6],[7,-7],[6,-7],[5,-7],[4,-7],[3,-7],[2,-7],[1,-7],[0,-7],[-1,-7],[-1,-6],[-1,-5]]
while status == True:
    move = input().split(" ")
    if move[0] == "d":
        for i in range(int(move[1])):
            currentPosition[1]-=1
            if currentPosition in positionList:
                print(currentPosition[0], end=" ")
                print(currentPosition[1], end=" ")
                print("DANGER")
                status = False
                currentStatus = False
                break
        if currentStatus == True:
            print(currentPosition[0],end=" ")
            print(currentPosition[1],end=" ")
            print("safe")

    elif move[0] == "u":
        for i in range(int(move[1])):
            currentPosition[1]+=1
            if currentPosition in positionList:
                print(currentPosition[0], end=" ")
                print(currentPosition[1], end=" ")
                print("DANGER")
                status = False
                currentStatus = False
                break
        if currentStatus == True:
            print(currentPosition[0],end=" ")
            print(currentPosition[1],end=" ")
            print("safe")
    elif move[0] == "l":
        for i in range(int(move[1])):
            currentPosition[0]-=1
            if currentPosition in positionList:
                print(currentPosition[0], end=" ")
                print(currentPosition[1], end=" ")
                print("DANGER")
                status = False
                currentStatus = False
                break
        if currentStatus == True:
            print(currentPosition[0],end=" ")
            print(currentPosition[1],end=" ")
            print("safe")
    elif move[0] == "r":
        for i in range(int(move[1])):
            currentPosition[0]+=1
            if currentPosition in positionList:
                print(currentPosition[0], end=" ")
                print(currentPosition[1], end=" ")
                print("DANGER")
                status = False
                currentStatus = False
                break
        if currentStatus == True:
            print(currentPosition[0],end=" ")
            print(currentPosition[1],end=" ")
            print("safe")
    elif move[0] == "q":
        status = False