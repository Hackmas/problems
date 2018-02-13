i=[1,0,1,0]

a=[1,0,1,0]

adbc=a[0]*a[3]-a[1]*a[2]

inv=[1/adbc*a[3],-1/adbc*a[1],-1/adbc*a[2],1/adbc*a[3]]

print(inv)
