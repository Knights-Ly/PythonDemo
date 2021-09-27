import sys

def get_real_url111(rr):
    module_ = sys
    modulelist = dir(module_)
    length = len(modulelist)
    for i in range(0,length, 1):
        print(getattr(module_, modulelist[i]))
    return False