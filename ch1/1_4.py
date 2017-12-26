#rethink
def replace(myInput, trueLength):
    temp = trueLength
    curEnd = len(myInput) - 1
    while(temp >= 0):
        if(myInput[temp] == ' '):
            myInput[curEnd] = '0'
            curEnd = curEnd - 1
            if()
        else:
            myInput[curEnd] = myInput[temp]
            curEnd = curEnd - 1

        print(myInput)

        temp = temp - 1
    print(myInput)



a = "Mr John Smith    "
l = list(a)

replace(l,13)
