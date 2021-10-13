
my_list = [33, 44, 66, 22, 11, 55, 77, 88, 99, 101, 123];

for num in my_list:
    if num % 2 == 0:
        print(num)
for num in my_list:
    print(num)

for i, value in enumerate(my_list):
    print(i, value)

i=0;
while(i<10):
    print(i)
    i+=1

my_dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'};
for key, value in my_dict.items():
    print(key, value)

my_dict = {'a':[0, 1, 2, 3], 'b':[0, 1, 2, 3], 'c':[0, 1, 2, 3], 'd':[0, 1, 2, 3]}
i = 0
output = []
for key in my_dict:
    output.append(my_dict[key][i])
    i += 1
print(output)

num_list = [2,4,6,8,10,12,14,16,18,20];
for num in num_list:
    if num<10:
        print(num + ' is less than 10.')
    else:
        print(num + ' is greater than 10.')

# function to find smallest positive number in a list
def smallest_positive(in_list):
    smallest = None;
    for num in in_list:
        if num > 0 and (smallest is None or num < smallest):
            smallest = num
    return smallest

# Test cases
print(smallest_positive([4, -6, 7, 2, -4, 10]))
# Correct output: 2

print(smallest_positive([.2, 5, 3, -.1, 7, 7, 6]))
# Correct output: 0.2

print(smallest_positive([-6, -9, -7]))
# Correct output: None

print(smallest_positive([]))
# Correct output: None

def print_the_nums(x):
    while x > 0:
        print(x)
        x -= 1
print_the_nums(100)

def sum(a,b):
    return a+b
sum(10,3)

def just_sort(the_list):
    the_list.sort()
    return len(the_list), the_list
just_sort([1,2,3,4,5,6,7,8,9,10])































