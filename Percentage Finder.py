a = 199818000   
b = 226174395   
   

r = ( ((b / a)**(1/11)) - 1 ) * 100

# print(r)

print(a)
c = a

# c = c + ((c//100) * r)
# print(c)

for i in range(1901,1911):
    c = c + ((c//100) * r)
    print(int(c))

print(b)