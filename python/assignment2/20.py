li = [2, 4, 1, 5, 3, 6, 8, 7 , 12, 15, 76, 21, 32, 9, 11]

start, end = int(input("From: ")), int(input("Till: "))
cnt = 0

for n in li:
    if start <= n <= end:
        cnt+=1

print(f"{li}\n{cnt} elements")