# Print a table containing multiplication tables.




start = 1                          # Define the range of numbers for the multiplication table
end = 20


print("Multiplication Table:")      # Print the header of the table


print("  ", end="")                  # Print the column headers
for i in range(start, end + 1):
    print(f"{i:4}", end="")
print()


print("-" * (4 * (end - start + 2)))      # Print the horizontal line separator


for i in range(start, end + 1):            # Print the rows of the multiplication table

    print(f"{i:2} |", end="")              # Print the row header


    for j in range(start, end + 1):          # Print the multiplication results for this row
        print(f"{i * j:4}", end="")


    print()                                   # Move to the next line after each row
