# 오르막길
# 앞의 한 칸씩 확인하면서 반복문을 통해 
# 오르막길이 시작하는 값과 끝나는 값을 저장해 최대값 갱신
N = int(input())
series = list(map(int, input().split()))
i = max_asc = 0
while i < N-1:
    if series[i] < series[i+1]:
        start = series[i]
        while i < N-1 and series[i] < series[i+1]:
            i+=1
        end = series[i]
        max_asc = max(max_asc, end-start)
    else:
        i+=1
print(max_asc)
