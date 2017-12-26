'''
Considers strings in the ASCII range
'''

def isPerm(a, b):
    chars = [0 for i in range (128)]
    for char in a:
        chars[ord(char)] += 1
    for char in b:
        chars[ord(char)] -= 1
        if(chars[ord(char)] < 0):
            return False
    return True

def main():
    if(isPerm("hello", "e") == True):
        print("Is permutation.")
    else:
        print("Not permutation.")

main()