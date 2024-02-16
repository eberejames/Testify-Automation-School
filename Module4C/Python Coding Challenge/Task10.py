# Create a function that filters out negative numbers.


def filter_negative_numbers(numbers):
    """
    Filter out negative numbers from the given list.

    Parameters:
        numbers (list): The input list of numbers.

    Returns:
        list: The list with negative numbers filtered out.
    """
    return list(filter(lambda x: x >= 0, numbers))

# Example usage:
numbers = [-71, 57, 45, 0.89, -6]
filtered_numbers = filter_negative_numbers(numbers)
print(filtered_numbers)
