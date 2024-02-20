li = ["is", "the", "from", "hence", "shopper", "mockery", "shopping"]
n = int(input("Length: "))

for word in li:
    if len(word) > n:
        print(word, end=" ")
