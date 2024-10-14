def solution(s):
    answer = [int(i) for i in s.split(" ")]
    print(answer)
    return str(min(answer))+" "+str(max(answer))