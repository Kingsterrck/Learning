a = input()
letcol = []
countcol = []
tempcount = 0
for i in a:
    temp = i
    tempcount = 0
    if (temp not in letcol):
        letcol.append(temp)
        for k in a:
            if (k==i):
                tempcount+=1
        countcol.append(tempcount)
maxx = max(countcol)
out = []
for i in range(len(letcol)):
    if (countcol[i] == maxx):
        out.append(letcol[i])
out.sort()
for i in out:
    print(i,end=" ")