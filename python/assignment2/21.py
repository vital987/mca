string = input("String: ")
dict = {}

for letter in string:
    if letter in "aeiouAEIOU":
        if letter in dict:
            dict[letter] += 1
        else:
            dict[letter] = 1
print(dict)
