num = int(input())
count = []
a = input().split(" ")
for i in a:
    count.append((i))
iter = int(input())
acc=0
for i in range(iter):
    temp = input()
    if (temp[0] in count):
        acc+=1
print(acc)