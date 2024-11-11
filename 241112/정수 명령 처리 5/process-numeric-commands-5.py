lst = []

n = int(input())
for i in range(n):
    a = input().split()
    if a[0] == 'push_back':
        lst.append(int(a[1]))
    elif a[0] == 'get':
        print(lst[int(a[1])-1])
    elif a[0] == 'size':
        print(len(lst))
    else:
        lst.pop(-1)
