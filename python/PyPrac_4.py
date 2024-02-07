# Experiment No. 04
# Title- Program to add digits of a number using while loop.
# Date:- 17/01/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

n = int(input("Number: "))
sum = 0
while(n):
    sum += int(n%10)
    n//=10
print("Addition of digits: ",sum)

#_______________________________________________________________
# Output:-
#       Number: 123
#       Addition of digits:  6