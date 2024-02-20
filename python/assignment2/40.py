dict = {1: None, "two": 2, None: "three", None: None}
dict2 = {}

for k, v in dict.items():
    if not (k == None or v == None):
        dict2[k] = v

print(dict2)
