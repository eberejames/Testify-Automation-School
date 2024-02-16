# Return the number of vowels in a string.



def count_vowels(string):
    """
    Count the number of vowels in the given string.

    Parameters:
        string (str): The input string.

    Returns:
        int: The number of vowels in the string.
    """
    # Define a set of vowels
    vowels = {'a', 'e', 'i', 'o', 'u'}

    # Convert the string to lowercase to handle both uppercase and lowercase vowels
    string = string.lower()

    # Initialize a counter for vowels
    count = 0

    # Iterate through each character in the string
    for char in string:
        # Check if the character is a vowel
        if char in vowels:
            # Increment the counter if it's a vowel
            count += 1

    return count

# Example usage:
input_string = "I am a tester"
print("Number of vowels in '{}':".format(input_string), count_vowels(input_string))
