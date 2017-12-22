import sys

'''
Check for unique chars through use of byte array. 
Time complexity O(n)
Space complexity O(1)
'''
def isStrUnique(strIn):
    if(len(strIn) > 128):
        return False
    charIndex = bytearray(128)
    for i in strIn:
        if(charIndex[ord(i)] == 1):
            return False
        else:
            charIndex[ord(i)] = 1
    return True

'''
Using a single integer vector
Constraint: input can only be A-Z, a-Z characters.
The size occupied by the int is 24 bytes, vs. 177 for the byte array
'''
def isStrUnique2(strIn):
    if(len(strIn) > 128):
        return False

    val = 0
    for i in strIn:
        if((val & (1 << (ord(i) - ord('A'))) > 0)):
            return False
        else:
            val |= (1 << (ord(i) - ord('A')))
    return True



def main():
    print(sys.version)
    inputStr = "myinput"
    print("Unique" if (isStrUnique(inputStr) is True) else "Not unique.")
    print("Unique" if (isStrUnique2(inputStr) is True) else "Not unique.")
    
main()

