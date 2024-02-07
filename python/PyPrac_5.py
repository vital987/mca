# Experiment NO. 05
# Title- Program to search whether all characters in
#        one string are available into another string.
# Date:- 17/01/2024
# Roll No.: MC23F14F064
# Name- Apurv Vyavahare

def Search(string1, string2):
    for char in string1:
        if char not in string2:
            return False
    return True

string1 = input("Enter the first string: ")
string2 = input("Enter the second string: ")

if Search(string1, string2):
    print("All characters in String 1 are available in String 2")
else:
    print("Some characters in String 1 are not available in String 2")
