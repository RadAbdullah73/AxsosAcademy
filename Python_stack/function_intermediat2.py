from itertools import count


x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

dojo = {
'locations': ['San Jose','Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
# ----------------------------------------------------------------
# (1)
# x[1][0] = 15
# print(x)
# ----------------------------------------------------------------
# students[0]['last_name'] = 'Bryant'
# print (students[0]) 
# ----------------------------------------------------------------
# sports_directory['soccer'][0] = 'Andres'
# print(sports_directory['soccer'])
# ----------------------------------------------------------------
# (z[0]['y']) = '30'
# print(z)
# ----------------------------------------------------------------
# def iterateDictionary(students):
#     for m in range(0,len(students)):
#         print('first_name -' , students[m]['first_name'] ,',', 'last_name -' , students[m]['last_name'])
# iterateDictionary(students)
# ----------------------------------------------------------------
# def iterateDictionary2(key_name, list):
#     for m in range(0,len(students)):
#         print(list[m][key_name])
# iterateDictionary2('last_name' , students)
# ----------------------------------------------------------------
# def printInfo(dict):
#     count1=0
#     for k in dict:
#         for x in range (len(dict[k])):
#             count1+=1
#         print(count1,k)
#         for y in range (len(dict[k])):
#             print(dict[k][y])
#         count1=0

# printInfo(dojo)

