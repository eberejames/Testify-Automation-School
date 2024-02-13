
# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human
# Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance


class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    pass

class Woman(Human):
    def get_gender(self):
        return "Female"

# Instantiate Man and Woman objects
man_instance = Man()
woman_instance = Woman()

# Print gender of each instance
print("Gender of man:", man_instance.get_gender())
print("Gender of woman:", woman_instance.get_gender())
