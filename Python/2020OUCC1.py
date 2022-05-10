# numCups = int(input())
# cups = []
# for i in range (numCups-1):
#     cups.append(0)
# cups.append(1)
# numSwaps = int(input())
# for i in range (numSwaps):
#     swap = input().split(" ")
#     swap[0] = int(swap[0])
#     swap[1] = int(swap[1])
#     if (cups[swap[0]] == 1):
#         cups[swap[0]] = 0
#         cups[swap[1]] = 1
#     elif (cups[swap[1]] == 1):
#         cups[swap[1]] = 0
#         cups[swap[0]] = 1
# for i in range (len(cups)):
#     if (cups[i] == 1):
#         print(i)

typ = input()
if (typ == "encode"):
    grid = []
    code = input()
    while (len(code) >= 4):
        tempRow = []
        for i in range (4):
            tempRow.append(code[i].upper())
        code = code[4:]
        grid.append(tempRow)
    tempRow = []
    for i in range (len(code)):
        tempRow.append(code[i].upper())
    for i in range(4-len(code)):
        tempRow.append("X")
    grid.append(tempRow)
    for row in range(4):
        for col in range(len(grid)):
            print(grid[col][row],end="")
else:
    grid = []
    code = input()
    