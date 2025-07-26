def nxt(lev, T):
    if not T: T = M
    if T == 1: return lev+1
    return ((lev//T)+1)*T

def bfs(Q):
    for i,j,lev,n in Q:
        for k in range(4):
            ni, nj = i+d[k], j+d[k-2]
            if ni < 0 or ni >= N or nj <0 or nj >= N: continue
            # 공사 진행을 다했고, 갈 수 없는 길인 경우
            if n and not arr[ni][nj]: continue
            # 오작교를 두 번 연속 건너는 경우
            if arr[ni][nj] !=1 and arr[i][j] !=1: continue
            # 공사를 진행 안했고, 갈 수 없는 길인 경우
            nn = n
            if not n and not arr[ni][nj]: nn = 1
            # 다음 길 시간 계산
            nlev = nxt(lev, arr[ni][nj])
            # 돌아 온 경우 더이상 탐색 필요 X 
            if best[nn][ni][nj] <= nlev: continue
            # 최소 시간 갱신
            best[nn][ni][nj] = nlev
            Q.append((ni, nj, nlev, nn))

N, M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
d = [0, 0, -1, 1]
best = [[[10000]*N for _ in range(N)] for _ in range(2)]
bfs([(0,0,0,0)])
print(min(best[0][-1][-1], best[1][-1][-1]))
