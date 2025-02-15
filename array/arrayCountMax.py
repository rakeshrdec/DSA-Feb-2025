a = [2,3,4,7,1,2,3,15,2,1]

sum = 0
max_sum = 0
for i in range(len(a)-1):
    # print(a[i])

    if(a[i]>a[i+1]):
        sum +=a[i]
        if (max_sum<sum):
            max_sum = sum
            print("Abort for pass",max_sum)
        sum = 0
        
    else:
        sum +=a[i]

print("This is maximum sum of one group", max_sum)