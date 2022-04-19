str = "saswat"
index = 3
if (index >= -len(str) and index < len(str)):
    updated_str = str[:index] + str[index+1:]
    print(f"the modified string is : {updated_str}")
else:
    print("provide a valid index")