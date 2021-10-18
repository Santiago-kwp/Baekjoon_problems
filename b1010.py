''' M-C-N 을 코드로 구현하기'''
for _ in range(int(input())):
    N, M = map(int, input().split())
    ans = 1
    for m in range(M, M-N, -1):
        ans *= m
    for n in range(1, N+1):
        ans //= n
    print(ans)
