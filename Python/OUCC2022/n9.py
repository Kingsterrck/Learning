a = int(input())
strrr = ""
for i in range (a):
    str+=input()
count = 0
this = ""
tempcount = 0
for i in strrr:
    temp = i
    tempcount = 0
    for k in strrr:
        if (k==i):
            tempcount+=1
    if (tempcount > count):
        this = temp
        count = tempcount
print(this)