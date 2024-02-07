# Experiment No. 08
# Title- Program to check whether the given number is palindrome by
#        passing function name as an argument to another function.
# Date:- 01/02/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

n = input("String: ")


def is_palindrome():
    global n
    n = str(n)
    return n == n[::-1]


def print_result(func):
    if func():
        print("Result: Yes")
    else:
        print("Result: No")


print_result(is_palindrome)

# _______________________________________________________________
# Output:-
# String: sir 
# Result: No

# String: madam
# Result: Yes
