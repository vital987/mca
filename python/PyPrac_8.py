# Experiment No. 08
# Title- Write a program to count digits of number using function.
# Date:- 01/02/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

def digit_sum(digit):
    digit = str(digit)
    if digit.isdigit():
        return len(digit)
    return -1

n = input("Number: ")
print("Digit Count: ", digit_sum(n))

# _______________________________________________________________
# Output:-
# Number: 12345
# Digit Count:  5
