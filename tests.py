import main
import unittest

class TestMain(unittest. TestCase):

    def test_addition(self):
        self.assertEqual(main.addition(1, 2), 3, "Should be 3")
        self.assertEqual(main.addition(5, 5), 10, "Should be 10")
        self.assertEqual(main.addition(40, 20), 60, "Should be 60")
        self.assertEqual(main.addition(-3, 2), "Should be -1")
        self.assertEqual(main.addition(2, 2), 4, "Should be 4")
        self.assertEqual(main.addition(4, 5), 9, "Should be 9")
        self.assertEqual(main.addition(6, 5), 11, "Should be 11")

if __name__ == '__main__':
    unittest.main()
