# Experiment No. 08
# Title- Program to check whether the given number is palindrome by
#        passing function name as an argument to another function.
# Date:- 01/02/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

from two_num_calc import calc

print(
    "Result:",
    calc(int(input("Number 1: ")), int(input("Number 2: ")), input("Operation: ")),
)

# _______________________________________________________________
# Output:-
# Number 1: 10
# Number 2: 3
# Operation: *
# Result: 30