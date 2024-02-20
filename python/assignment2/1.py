start, end = int(input("From: ")), int(input("Till: "))

for i in range(start, end + 1):
    prime = True
    for j in range(2, i):
        if i % j == 0:
            prime = False
    if prime:
        print(i, end=", ")
