a = int(input())
b = input().split(" ")
for i in b:
    if (0.5*a <= int(i)):
        a = int(0.5*a)+int(i)

print(a)