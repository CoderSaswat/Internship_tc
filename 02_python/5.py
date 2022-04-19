from cmath import sqrt
import math
coord1 = [7, 4, 3]
coord2 = [17, 6, 2]
i = 0
sum = 0
while i < len(coord1):
    sum += math.pow((coord2[i] - coord1[i]), 2)
    i += 1
print(f"distance between the two points is : {sqrt(sum)}")