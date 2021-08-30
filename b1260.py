'''
dfs 와 bfs 함수를 각각 정의하고
인접리스트를 만들어서 sorted()한 뒤 번호가 작은 순으로 출력되도록 함
'''
N, M, V = map(int, input().split())
adj = [[] for _ in range(1001)]
for _ in range(M):
    n1, n2 = map(int, input().split())
    adj[n1].append(n2)
    adj[n2].append(n1)

visited = [0]*(N+1)
def dfs(v):
    visited[v] = 1
    print(v, end=' ')
    for w in sorted(adj[v]):
        if not visited[w]:
            dfs(w)
dfs(V)
print()

visited = [0]*(N+1)
def bfs(v):
    front = rear = -1
    q = [0]*1001
    rear += 1
    q[rear] = v
    visited[v] = 1
    while front!=rear:
        front += 1
        t = q[front]
        print(t, end=' ')
        for w in sorted(adj[t]):
            if not visited[w]:
                visited[w] = 1
                rear += 1
                q[rear] = w
bfs(V)

    
    
