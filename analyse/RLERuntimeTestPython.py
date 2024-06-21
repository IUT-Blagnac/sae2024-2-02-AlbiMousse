import time
import pyRAPL

pyRAPL.setup()

@pyRAPL.measure
def RLE(chaine :str ) -> str:
    nvlchaine = ""
    cpt = 1
    for i in range(len(chaine)):
        if i<len(chaine)-1 and chaine[i] == chaine[i+1] and cpt<9: 
            cpt=cpt+1
        else :
            nvlchaine = nvlchaine + str(cpt) + chaine[i]
            cpt = 1
    return nvlchaine

start_time = time.time()
result = ""
timee = 0
for i in range(50):
    result = RLE("eeeaaaazzz")
    timee += (time.time() - start_time)
print(result)
print("--- %s seconds ---" % (timee/50))