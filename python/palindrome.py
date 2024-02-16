def numInput():
    return input("Number: ")

def checkPalindrome(num):
    n = num()
    return n == n[::-1]

def displayResult(palindrome):
    print("Palindrome") if palindrome else print("Not Palindrome")

displayResult(checkPalindrome(numInput))
