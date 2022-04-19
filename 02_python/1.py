num = 1221
temp = num
rev = 0
while num != 0:
    r = num % 10
    rev = rev * 10 + r
    num = num // 10
if rev == temp:
    print(f"{temp} is a palindrome number")
else:
    print(f"{temp} is not a palindrome number")