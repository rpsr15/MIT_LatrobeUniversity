# -*- coding: utf-8 -*-
"""
Created on Tue Aug  7 10:37:17 2018

@author: 19539061
"""


"""
Exercise 1: Now, declare variable q assigned with the string “ABCDEFGHIJK”.
Repeat the above slicing to see whether identical outcomes are observed for string
objects. 
"""
p = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k']
print(p[3:7])
print(p[:4])
print(p[6:])
print(p[-5 : -1])
print(p[-3:])
print(p[:-1])
print(p[8:4])
print(p[-2:2])
print(p[-3:0])

q = 'abcdefghijk'
print(q[3:7])
print(q[:4])
print(q[6:])
print(q[-5 : -1])
print(q[-3:])
print(q[:-1])
print(q[8:4])
print(q[-2:2])
print(q[-3:0])



"""
Exercise 2: N-dimensional arrays can be declared for some other programming
languages. Is it possible to declare an N-dimensional list for Python? If you think so,
try to create a 2-dimensional list, and show how the elements can be accessed. 
"""
twoD = [[1,2,3],[4,5,6]]
print(twoD)
twoD_2 = [['a',2,'b'], [4,5,6]]
print(twoD_2)


#sets
set1 = {'A', 90, 29.4, -7.8, 'B', 'C'}
print('A' in set1)

#Dictionary
d = {1: 'Peter', 2 : 'Mark', 3:'tracy', 4: 'judy'}
print(d[4])
print(6 in d)


"""
Exercise 3
"""
print("exercise 3")
x = 0
y = 0
print (x is y)
print(x == y)

x = 'A'
y = 'A'
print(x is y)
print(x ==y)

x = True
y = True
print(x is y)

x = [1, 2, 3, 4, 5]
y = [1, 2, 3, 4, 5]
print(x is y)
print(x == y)

x = {1,2,3,4}
y = {1,2,3,4}
print(x is y)
print(x == y)

x = {1 : 'A', 2:'B', 3:'C'}
y = {1:'A', 2:'B', 3:'C'}
print(x is y)
print(x == y)

if 6 > 5:
    print('6 is larger than 5')


x = -1
if x >=0:
    print('x is non-negative')
else:
    print('x is negative')
    
sub = 'DM'
class_code = 1
if sub == 'PROG':
    print('The subject is introduction to programming')
    print('The lecture room is HG401')
elif sub == 'MATH':
    print('The subject is Mathematics for computer science')
    print('The lecture room is DC105')
elif sub == 'DM' and class_code == 1:
    print('the subject is data minnig')
    
    
for i in range(6):
    print(i)
    
for i in range(2,10):
    print(i)

for i in range(-3, 7):
    print(i)


for i in range(0,7,2):
    print(i)
    
for i in range(10, -1, -1):
    print(i)
    
    
names = ['Tom', 'May', 'Eva', 'Scott', 'Ivan', 'Edith']
for name in names:
    print(name)
    
