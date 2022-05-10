a = int(input())
b = []
for i in range (a):
    b.append(int(input()))
c = 0
for i in range (len(b)-1):
    if (b[i]<b[i+1]):
        c+=100
print(c)