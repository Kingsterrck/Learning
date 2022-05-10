a = input().split(" ")
hour = 0
minute = 0
for i in range(0,5):
    if a[i] == "R" or a[i] == "B":
        if i == 0 or i == 1:
            hour += 1
        elif i == 2:
            hour += 2
        elif i == 3:
            hour += 3
        else:
            hour += 5

for i in range(0,5):
    if a[i] == "G" or a[i] == "B":
        if i == 0 or i == 1:
            minute += 1
        elif i == 2:
            minute += 2
        elif i == 3:
            minute += 3
        else:
            minute += 5
minute *= 5
if minute == 60:
    hour +=1
elif minute > 60:
    minute -= 60
if hour >= 12:
    hour -= 12
if hour < 10:
    print("0",end="")
print(hour,end="")
print(":",end="")
if minute < 10:
    print("0",end="")
if minute == 60 or minute == 0:
    minute = "00"
print(minute)
