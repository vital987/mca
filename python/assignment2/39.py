statement = input("String: ")
tmp = ""

for letter in statement:
    if(letter.isupper()):
        print(letter.lower(), end="")
    elif(letter.islower()):
        print(letter.upper(), end="")
