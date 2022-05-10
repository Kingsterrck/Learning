tar = input()
cur = tar[0]
last = ""
out = ""
count = 0


for i in range(len(tar)-1):
    if (tar[i]!=tar[i+1]):
        out=out+tar[i]+count
        count = 1
    else:
        count+=1
out+=str(tar[len(tar)-1])+str(count+1)
print(out)