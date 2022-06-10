k = int(input())
n = input()
letters = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
returnStr = ""
for i in range(len(n)):
    temp = n[i]
    ind = (i+1)*3+k
    current = letters.index(temp)+1
    tar=0
    # tar + ind = current
    tar = current % 26 - ind
    returnStr = returnStr + letters[tar-1]
print(returnStr)