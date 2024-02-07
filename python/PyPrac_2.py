# Experiment No. 02
# Title- Program to swap values of two variables using bitwise operator.
# Date:- 17/01/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

# using XOR Operator
x = 11
y = 55

x = x ^ y
y = x ^ y
x = x ^ y

print("Value of x after swapping: ", x)
print("Value of y after swapping: ", y)

#____________________________________________________________________________________
# Output:-
#       Value of x after swapping:  55
#       Value of y after swapping:  11
