num = int(input())
row1 = input()
row2 = input()
count = 0
for i in range(num):
    if row1[i] == "C" and row2[i] == "C":
        count += 1
print(count)