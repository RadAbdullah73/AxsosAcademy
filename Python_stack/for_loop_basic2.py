def biggie_size(list):
    newlist = []
    for x in range(0, len(list), 1):
        if list[x] <= 0:
            newlist.append(list[x])
        if list[x] > 0:
            list[x] = 'big'
            newlist.append(list[x])
    return newlist


print(biggie_size([-1, 5, 7, 9, 6, -2, 7]))
# # ---------------------------------------------------------------


def count_positives(list):
    count = 0
    for x in range(0, len(list), 1):
        if list[x] > 0:
            count = count+1
    list[len(list)-1] = count
    return list


print(count_positives([1, 2, 4, 3, -1, -7, 11, 7, -5]))
# # ----------------------------------------------------------------


def sum_total(list):
    sum = 0
    for x in range(0, len(list), 1):
        sum = sum+list[x]
    return sum


print(sum_total([2, 3, 4, 5, -1]))
# # ----------------------------------------------------------------


def average(list):
    sum = 0
    for x in range(0, len(list), 1):
        sum += list[x]
    avg = sum / len(list)
    return avg


print(average([1, 2, 3, 4]))
# # ----------------------------------------------------------------


def length(list):
    return len(list)


print(length([1, 22, 3, 4, 5, 0]))
# # ----------------------------------------------------------------


def minumum(list):
    length = len(list)
    if length == 0:
        return "false"
    min = list[0]
    for x in range(1, len(list), 1):
        if list[x] < min:
            min = list[x]
    return min


print(minumum([1, 2, 3, 0, 5, 7]))
# # ----------------------------------------------------------------


def maximum(list):
    length = len(list)
    if length == 0:
        return "false"
    max = list[0]
    for x in range(1, len(list), 1):
        if list[x] > max:
            max = list[x]
    return max


print(maximum([1, 2, 3, 0, 5, 7]))
# -----------------------------------------------------------------


def ultimate_analysis(list):
    analysis = {'Sum': sum_total(list), 'Average': average(list), 'Max': maximum(
        list), 'min': minumum(list), 'length': length(list)}
    return analysis


print(ultimate_analysis([1, 2, 3, 4, 5]))
# --------------------------------------------------------------------


def reverse_list(list):
    temp = 0
    for x in range(0, len(list), 1):
        if x == len(list)/2 or x == (len(list)-1)/2:
            break
        temp = list[x]
        list[x] = list[len(list)-(x+1)]
        list[len(list)-(x+1)] = temp
    return list


print(reverse_list([1, 2, 3, 4, 5, 6, 7, 9, 10]))
