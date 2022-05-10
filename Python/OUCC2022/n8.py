a = int(input())
count = 0
total = []
for i in range (a):
    temp = input().split(" ")
    total.append(temp)
desi = []
loki = []
stat = False
for i in range(len(total)):
    if (i%2==0):#desi
        stat = False
        for k in total:
            if (k[0]>k[1]):
                temp = k
                total.remove(k)
                desi.append(k)
                stat = True
        if (stat == False):
            temp = total[0]
            total.remove(temp)
            desi.append(temp)
    else:#loki
        stat = False
        for k in total:
            if (k[0]<k[1]):
                temp = k
                total.remove(k)
                loki.append(k)
        if (stat == False):
            temp = total[0]
            total.remove(temp)
            loki.append(temp)
count = 0
for i in loki:
    count += int(i[1])
print(count)