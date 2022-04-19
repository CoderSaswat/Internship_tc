string_list = ["saswat", "raja", "sk", "raj", "kanha"]
curr_length = len(string_list[0])
smallest_string = string_list[0]
for ele in string_list:
    if len(ele) < curr_length:
        smallest_string = ele
        curr_length = len(ele)
print(f"smallest string in the list : {smallest_string}")