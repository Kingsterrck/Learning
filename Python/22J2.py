playerNum = int(input())
starPlayer = 0
for i in range (playerNum):
    score = int(input())
    foul = int(input())
    point = score*5-foul*3
    if point>40:
        starPlayer+=1
print(starPlayer,end="")
if starPlayer == playerNum:
    print("+")