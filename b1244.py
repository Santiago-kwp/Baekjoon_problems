# 스위치 켜고 끄기
# 비트 연산자 활용
def onoff(x, n):
    if x == 1:
        for i in range(n-1,N,n):
            switch[i] ^= 1
    if x == 2:
        switch[n-1] ^= 1
        l, r = n-2, n
        while l>=0 and r<N:
            if switch[l] == switch[r]:
                switch[l] ^= 1
                switch[r] ^= 1
                l -= 1
                r += 1
            else: return

N = int(input())
switch = list(map(int, input().split()))
M = int(input())
for _ in range(M):
    x, n = map(int, input().split())
    onoff(x, n)
for i in range(0,N,20):
    print(*switch[i:i+20])