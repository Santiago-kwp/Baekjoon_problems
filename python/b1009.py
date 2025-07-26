'''
4로 순환하는 수는 알았지만, 번호 10을 빼먹어 애먹었던 문제...
'''
for _ in range(int(input())):
    a, b = map(int, input().split())
    n = b%4 if b%4 else 4
    print( (a**n)%10 if (a**n)%10 else 10)