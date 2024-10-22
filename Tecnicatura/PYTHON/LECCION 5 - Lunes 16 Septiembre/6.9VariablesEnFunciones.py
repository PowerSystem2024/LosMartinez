# crear una funcion para sumar los valores recibidos de tipo int, utilizando como argumento *args, sumar todos los valores

def sumAllValues(*nums):

    sum = 0

    for i in nums:
        sum += i

    return sum

n = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10]

res = sumAllValues(*n)

print(res)