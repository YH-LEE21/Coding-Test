import time
def solution(age):
    now = time.gmtime(time.time())
    return now.tm_year - (age+1)
