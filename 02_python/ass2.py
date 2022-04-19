"""
Assignment 2
"""
from tabnanny import check
import time


def time_check():
    """
    check the execution time of a given method
    :return:
    """
    start_time = time.time()
    read_testcases()
    time.sleep(1)
    end_time = time.time()
    print("Time in seconds: " + str(end_time - start_time))
    return True


def read_testcases():
    """
    reads all testcases from an external file i.e testcases.txt line by line
    """
    f = open("testcases.txt", "r")
    testcases = f.readlines()
    for i in range(len(testcases)):
        check_longest_shortest_palindrome(testcases[i])


def check_longest_shortest_palindrome(my_string):
    """
    prints the longest even number palindrome and shortest odd number palindrome substring from a given string of length greater than 2
    :param my_string : given string
    """
    temp_string = ""
    longest_even_number_palindrome = ""
    shortest_odd_number_palindrome = ""
    current_length = len(my_string)
    i_index = 0
    # this is the greedy approach to solve this problem
    while i_index < len(my_string):
        temp_index = i_index
        j_index = i_index+1
        while j_index < len(my_string):
            while(temp_index <= j_index):
                # extracting each posible substrings one by one
                temp_string = temp_string+my_string[temp_index]
                # making sure all substrings should be greater than of length 2
                if len(temp_string) > 2:
                    # finding the longest even number palindrome
                    if len(temp_string) % 2 == 0 and is_palindrome(temp_string):
                        # comparing the length and update "longest_even_number_palindrome" accordingly
                        if len(temp_string) > len(longest_even_number_palindrome):
                            longest_even_number_palindrome = temp_string
                    # finding the shortest odd number palindrome
                    elif len(temp_string) % 2 != 0 and is_palindrome(temp_string):
                        # comparing the length and update "shortest_odd_number_palindrome" accordingly
                        if(len(temp_string) < current_length):
                            shortest_odd_number_palindrome = temp_string
                            current_length = len(temp_string)
                temp_index += 1
            j_index += 1
        temp_string = ""
        i_index += 1
    if(len(longest_even_number_palindrome) == 0):
        longest_even_number_palindrome = "None"
    if(len(shortest_odd_number_palindrome) == 0):
        shortest_odd_number_palindrome = "None"
    print(f"{longest_even_number_palindrome} , {shortest_odd_number_palindrome}")


def is_palindrome(my_string):
    """
    checks wheather a given string is a palindrome or not
    :param my_string : given string
    :return : it's a valid palindrome or not
    """
    i_index = 0
    j_index = len(my_string)-1
    while i_index < j_index:
        if my_string[i_index] != my_string[j_index]:
            return False
        i_index += 1
        j_index -= 1
    return True


if __name__ == "__main__":
    time_check()
