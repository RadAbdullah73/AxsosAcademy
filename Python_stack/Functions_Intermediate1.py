import random
def randomInt ( min ='' , max ='' ):
    if min=='' and max =='':
        num = random.random() * 100
    elif min== '' and max!='':
        num = random.random() * (max)
    elif min !='' and max =='':
        num = random.random() * (100-min) + (min)
    elif min!='' and max!='':
        num = random.random() *(100-min) + (min)

    return num 

# print(randomInt())
# print(randomInt(max=10))
# print(randomInt(min=97))
# print(randomInt(min = 99 , max = 100))
