
def fib(n):
    a, b = 0, 1
    while n > 0:
        a, b = b, a + b
        n -= 1
    return a

print([fib(i) for i in range(10)])

'''
3
10
15
25
'''
print([fib(i) for i in range(10)])
print([fib(i) for i in range(15)])
print([fib(i) for i in range(25)])
'''
5
23
70
90
100
120
'''
print([int(fib(i)) for i in range(23)])
print([int(fib(i)) for i in range(70)])
print([int(fib(i)) for i in range(90)])
print([int(fib(i)) for i in range(100)])
print([int(fib(i)) for i in range(120)])
