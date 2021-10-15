# def dijkstra():
#     MST = [[0]*N for _ in range(N)]
#     rupee = [[100000]*N for _ in range(N)]
    
#     i = j = 0
#     rupee[i][j] = cost[i][j]
#     for _ in range(N**2):
#         minC = 100000
#         # MST에 해당 안되는 인덱스 중 최소값을 가지는 행, 열 인덱스 선택!

#         MST[i][j] = 1

#         for k in range(4):
#             ni, nj = i+d[k], j+d[k-2]
#             if ni < 0 or ni >=N or nj < 0 or nj >=N or MST[ni][nj]: continue
#             rupee[ni][nj] = min(rupee[ni][nj], cost[ni][nj]+rupee[i][j])
#     print(rupee)
#     return rupee[-1][-1]

def bfs():
    Q = [(0,0)]
    arr = [[10000]*N for _ in range(N)]
    arr[0][0] = cost[0][0]
    for i, j in Q:
        for k in range(4):
            ni, nj = i+d[k], j+d[k-2]
            if ni < 0 or ni >=N or nj < 0 or nj >=N: continue
            if arr[ni][nj] > arr[i][j]+cost[ni][nj]:
                arr[ni][nj] = arr[i][j]+cost[ni][nj]
                Q.append((ni, nj))
    return arr[-1][-1]
d = [0, 0, -1, 1]
tc = 1
while N:=int(input()):
    cost = [list(map(int, input().split())) for _ in range(N)]
    print(f'Problem {tc}: {bfs()}')
    tc += 1
