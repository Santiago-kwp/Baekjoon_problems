# 빙고

def bingo():
    cross1 = cross2 = 0
    cnt = 0
    for r in range(5):
        row = col = 0
        for c in range(5):
            row += arr[r][c]
            col += arr[c][r]
            if r==c:
                cross1 += arr[r][c]
            if r+c==4:
                cross2 += arr[r][c]
        if row == 5: cnt += 1
        if col == 5: cnt += 1
    if cross1 == 5: cnt += 1
    if cross2 == 5: cnt += 1
    if cnt >2 : return 1
        
cnt = [0]*26
for i in range(5):
    for j, n in enumerate(map(int, input().split())):
        cnt[n] = (i, j)

arr = [[0]*5 for _ in range(5)]
call = [list(map(int, input().split())) for _ in range(5)]

for i in range(5):
    for j in range(5):
        # 몇번 째 수 인지 번호 : i*5+j+1
        r, c = cnt[call[i][j]]
        print('r:c',r, c)
        arr[r][c] = 1
        if bingo():
            print(i*5+j+1)
            exit()
