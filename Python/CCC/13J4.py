limit = int(input())
count = int(input())
collection = []
for i in range(count):
    temp = int(input())
    collection.append(temp)
collection.sort()
count2 = 0
count3 = 0
for i in collection:
    if (count3 + i <= limit):
        count2 += 1
        count3 += i
    else:
        break
print(count2)