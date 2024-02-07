# Experiment No. 03
# Title- Program to print non-prime numbers from the 
#        given range using for loop.
# Date:- 17/01/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

start = int(input("Start: "))
end = int(input("End: "))
print("Non-Prime numbers: ", end="")
for i in range(start, end + 1):
    prime = True
    for j in range(2, i):
        if i % j == 0:
            prime = False
    if not prime:
        print(i, end=" ")

#______________________________________________________________
# Output:-
#        Start: 1
#        End: 10
#        Non-Prime numbers: 4 6 8 9 10 