a = input()
b= a.split(" ")

for i in range (0,len(b)):
    for k in range (0,len(b)):
        temp = abs(int(b[i]) - int(b[k]))
        print(temp,end="")
        print(" ",end="")
    print("")