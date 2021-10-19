'''
2중 반복문을 통해 모든 문자를 한문자씩 확인하면서 전체 확인하면 
해당 문자를 더하고, 전체가 아니면 ? 를 더함
'''
N = int(input())
files = []
for _ in range(N):
    files.append(input())
ans = ''
for i in range(len(files[0])):
    j = 0
    while j < N-1 and files[j][i] == files[j+1][i]:
        j += 1
    ans += files[j][i] if j == N-1 else '?'
print(ans)
    

