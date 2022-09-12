def CountDown(num):
    array = [] 
    for x in range(num , 0 , -1):
        array.append(x)
    return array 
y=CountDown(88)
print(y)

# ------------------------------------------------------------------------
def print_and_return(list):
    print(list[0])
    return list[1]
print(print_and_return([1,2]))

# ------------------------------------------------------------------------
def first_plus_length(array):
    sum = len(array) + array[0]
    return sum 
print(first_plus_length([88,3,3,3,2,1,3,5]))
# ------------------------------------------------------------------------
def values_greater_than_second(list):
    newlist=[]
    if len(list) < 2:
        return  "false"
    for x in range (0 , len(list) , 1):
        if list[x] > list[1]:
            newlist.append(list[x])
    
    return newlist 
print(values_greater_than_second([2,3,2,1,7,10]))
        
# -------------------------------------------------------------------------

def length_and_value(length , value):
    newlist=[]
    for x in range (0 , length , 1):
        newlist.append(value)
    return newlist
print(length_and_value(5,1))



