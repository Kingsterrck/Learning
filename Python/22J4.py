inSameGroup = []
notInSameGroup = []
violation = 0
group = []

#inserting students that must be in the same group
inSameGroupCount = int(input())
for i in range (inSameGroupCount):
    temp = input()
    sameGroupPpl = temp.split(" ")
    inSameGroup.append(sameGroupPpl)

#inserting students that must not be in the same group
notInSameGroupCount = int(input())
for i in range (notInSameGroupCount):
    temp = input()
    differentGroupPpl = temp.split(" ")
    notInSameGroup.append(differentGroupPpl)

# calculating
groupCount = int(input())
for i in range (groupCount):
    temp = input()
    currentGroup = temp.split(" ")
    group.append(currentGroup)
    for k in inSameGroup:
        if (k[0] not in currentGroup and k[1] in currentGroup)or(k[0] in currentGroup and k[1] not in currentGroup):
            violation += 1
            inSameGroup.remove(k)
    for l in notInSameGroup:
        if l[0] in currentGroup and l[1] in currentGroup:
            violation += 1
            notInSameGroup.remove(l)
# for i in notInSameGroup:
#     for l in group:
#         stu1 = l[0]
#         stu2 = l[1]
#         stu3 = l[2]
#         if (stu1 in i and stu2 in i) or (stu1 in i and stu3 in 1) or (stu2 in i and stu3 in i):
#             violation+=1
#             break
print(violation)