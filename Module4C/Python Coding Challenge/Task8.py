# Return a Boolean if a number is divisible by 10


def is_divisible_by_10(number):
    """
    Check if the given number is divisible by 10.

    Parameters:
        number (int): The number to check.

    Returns:
        bool: True if the number is divisible by 10, False otherwise.
    """
    return number % 10 == 0


number = 96
print(is_divisible_by_10(number))

number = 120
print(is_divisible_by_10(number))
