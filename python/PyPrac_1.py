# Experiment No. 01
# Title- Write a program to find smallest and largest from three given numbers.
# Date:- 09/01/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
num3 = int(input("Enter the third number: "))

largest = max(num1, num2, num3)
smallest = min(num1, num2, num3)

print("Largest number:", largest)
print("Smallest number:", smallest)

#____________________________________________________________________________________
# Output:-
#    Enter the first number: 123
#    Enter the second number: 4
#    Enter the third number: 34
#    Largest number: 123
#    Smallest number: 4