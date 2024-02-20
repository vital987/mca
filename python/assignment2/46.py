dict = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five'}
dict2 = {}

for k, v in dict.items(): 
    if (k%2 == 0):
        dict2[k] = v

print(dict2)