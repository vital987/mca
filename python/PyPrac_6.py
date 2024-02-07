# Experiment No. 06
# Title- Write a program for result processing using nested list.
# Date:- 01/02/2024
# Roll No.: MC23F14F056
# Name- Shishir Sakhare

num_students = int(input("Enter the number of students: "))
info = []
for i in range(num_students):
    name = input("Name: ")
    sub1, sub2, sub3 = map(float, input("Enter marks of 3 subjects: ").split())
    info.append([name, sub1, sub2, sub3])
for i in info:
    name = i[0]
    marks = i[1:]
    average = sum(marks) / len(marks)
    print("Average marks of {0}: {1}".format(name, average))


#_____________________________________________________________________________________
# #Output:-
# Enter the number of students: 2
# Name: Shishir
# Enter marks of 3 subjects: 66 78 88
# Name: Apurv
# Enter marks of 3 subjects: 88 70 89
# Average marks of Shiv: 77.33333333333333
# Average marks of Apurv: 82.33333333333333
