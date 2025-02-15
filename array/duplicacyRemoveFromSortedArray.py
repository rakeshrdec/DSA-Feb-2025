# THIS IS ONGOING CODE NOT COMPLETED YET

# a = [1,1,2,3,3,3,3,4,5,6,7,7,8,9,9,9,9,10]
a = [1,2,3,4,5,6,7,7]
duplicate_count = 0


def shiftOneElementLeftAndPopLastElement(a, index):
    global duplicate_count
    print(duplicate_count)
    duplicate_count += 1
    for i in (range(index, len(a)-1)):
        a[i] = a[i+1]
    print("New Array")
    print(a)
    
for i in (range(len(a)-2)):
    # print(a[i])
    if(a[i]==a[i+1]):
        print("Found Duplicate Element")
        print(a[i])
        shiftOneElementLeftAndPopLastElement(a, i)
 
if duplicate_count >0 :       
    for i in range(duplicate_count-3):
        a.pop()

print("Final Array")
print(a)