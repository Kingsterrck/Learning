for i in range (5) :
    accum = 0
    a = input().split(" ")
    for k in range (len(a[0])-int(a[1])+1) :
        temp = a[0][k:k+1[2]]
        accum += int(temp)
    print(accum)
