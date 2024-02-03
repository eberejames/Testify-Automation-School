

# Use for loop to iterate from 0 to 10
number = 10
for i in range(number):
    print("Number ", i)

# If the i value is equal to 2 add the continue

for i in range(number):
    if i == 2:
        continue
    print("Number ", i)


#  If the i value is equal to 8 add the break statement

for i in range(number):
    if i == 8:
        break
    print("Number ", i)
