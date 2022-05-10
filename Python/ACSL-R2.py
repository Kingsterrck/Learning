inputString = input()
inputStringList = []
for i in range(len(inputString)):
    inputStringList.append(inputString[i])
num1 = inputStringList[0]
num2 = inputStringList[2]
fib = [num1,num2]
startingLetter = inputStringList[4]
letters = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
startingLetterIndex = 0
currentFibIndex = 0
encryptor = 0
for i in range(len(letters)):
    if letters[i] == startingLetter:
        startingLetterIndex = i

for i in range (2,20): #making the fibonacci array
    fib.append(fib[i-2]+fib[i-1])

for i in range(6,len(inputStringList)):
    currentLetter = inputStringList[i]
    encryptor = fib[currentFibIndex%20]
    currentFibIndex+=1
    letterLocation = int(encryptor) + int(startingLetterIndex)
    if (letterLocation > 25):
        letterLocation %= 25
    offsetLetter = letters[letterLocation]
    ennum1 = ord(offsetLetter)
    ennum2 = ord(inputStringList[i])
    print(3*ennum1+ennum2, end=" ")