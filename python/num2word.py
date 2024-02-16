d = {
    1: "one",
    2: "two",
    3: "three",
    4: "four",
    5: "five",
    6: "six",
    7: "seven",
    8: "eight",
    9: "nine",
    10: "ten",
    11: "eleven",
    12: "twelve",
    13: "thirteen",
    14: "fourteen",
    15: "fifteen",
    16: "sixteen",
    17: "seventeen",
    18: "eighteen",
    19: "nineteen",
    20: "twenty",
    30: "thirty",
    40: "fourty",
    50: "fifty",
    60: "sixty",
    70: "seventy",
    80: "eighty",
    90: "ninety",
    100: "hundred",
}

n = input("Number: ")
h, t, u = 0, 0, 0

# Remove padded zeroes
n = str(int(n))

if not (n.isdigit() and 1 <= len(n) <= 3):
    print("invalid string or number > 999")
    exit()

match (len(n)):
    case 1:
        u = int(n)
    case 2:
        u = int(n[1])
        t = int(n[0])
    case 3:
        u = int(n[2])
        t = int(n[1])
        h = int(n[0])

if u and not t and not h:
    print(d[int(n)])
elif u and t and not h:
    if int(n) in d:
        print(d[int(n)])
    else:
        print(d[int(str(t) + "0")] + " " + d[int(u)])
elif u and t and u:
    if int(n) in d:
        print(d[int(n)])
    else:
        print(d[h] + " hundred and " + d[int(str(t) + "0")] + " " + d[int(u)])
