# Experiment No. 07
# Title- Write a program for Result Processing using dictionary.
# Date:- 01/02/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

num_students = int(input("Enter the number of students: "))
student_data = {}

for i in range(num_students):
    name = input("Enter the name of student {}: ".format(i + 1))
    marks = list(map(float, input("Enter marks of 3 subjects (separated by space): ").split()))
    student_data[name] = marks

for name, marks in student_data.items():
    average = sum(marks) / len(marks)
    print("Average marks of {}: {:.2f}".format(name, average))

print(student_data)

# _____________________________________________________________________________________
# #Output:-
# Enter the number of students: 3
# Enter the name of student 1: Shiv
# Enter marks of 3 subjects (separated by space): 12 24 36
# Enter the name of student 2: Shishir
# Enter marks of 3 subjects (separated by space): 11 22 33
# Enter the name of student 3: Apurv
# Enter marks of 3 subjects (separated by space): 10 20 30
# Average marks of Shiv: 24.00
# Average marks of Shishir: 22.00
# Average marks of Apurv: 20.00
# {'Shiv': [12.0, 24.0, 36.0], 'Shishir': [11.0, 22.0, 33.0], 'Apurv': [10.0, 20.0, 30.0]}
