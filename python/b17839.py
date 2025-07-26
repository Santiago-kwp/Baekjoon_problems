# Baba is rabbit
# BFS 지만 시간초과로 인해 중복을 배제한 방문 배열을 정의하여 
# append로 인한 시간을 줄였던게 핵심인 문제였다.
import sys

N = int(input())
cmd = {}
for _ in range(N):
    p, _, q = sys.stdin.readline().split()
    try: cmd[p].append(q)
    except: cmd[p] = [q]

ans = []
visited = {}
Q = ['Baba']
for st in Q:
    try:
        for c in cmd[st]:
            if c not in visited:
                visited[c] = 1
                Q.append(c)
                ans.append(c)
    except: continue

for a in sorted(ans):
    print(a)
