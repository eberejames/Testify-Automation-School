# Create a function that reverses an array



def reverse_array(arr):
    """
    Reverse the given array.

    Parameters:
        arr (list): The input array.

    Returns:
        list: The reversed array.
    """
    return arr[::-1]


original_array = [1, 10, 2.5, 69, 36]
reversed_array = reverse_array(original_array)
print(original_array)
print(reversed_array)
