a = 0
b = 0

temp = input().split(" ")
a= a + int(temp[1]) - 3*int(temp[2])
temp = input().split(" ")
b= a + int(temp[1]) - 3*int(temp[2])
temp = input().split(" ")
a= a + int(temp[1]) - 3*int(temp[2])
temp = input().split(" ")
b= a + int(temp[1]) - 3*int(temp[2])

if (a>b):
    print("A")
elif (b>a):
    print("B")
else:
    print("draw")