import os,sys

def ret(url):
    if(os.path.exists(url)):
        if(os.path.isfile(url)):
            os.remove(url)
        else:
            L=os.listdir(url)
            if(len(L)==0):
                os.rmdir(url)
            else:
                for x in L:
                    ret(os.path.join(url,x))
    else:
        return
    
def cycleRet(curPath):
    while(os.path.exists(curPath)):
        ret(curPath)

workPath=os.getcwd()
if(os.path.exists(workPath)):
    if(os.path.isdir(workPath)):
        L=os.listdir(workPath)
        for x in L:
            tempPath=os.path.join(workPath,x)
            if(os.path.isdir(tempPath)):
                U=os.listdir(tempPath)
                for y in U:
                    tmpPath=os.path.join(tempPath,y)
                    if(os.path.isdir(tmpPath) and y=='node_modules'):
                        cycleRet(tmpPath)
        