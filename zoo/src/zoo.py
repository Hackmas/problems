def zoo(liste):
    dyr = liste.split(',')
    dyr_liste = {}

    for d in dyr:
        dyret = d.split()
        dyret = dyret[-1].lower()
        if dyret in dyr_liste:
            dyr_liste[dyret] += 1
        else:
            dyr_liste[dyret] = 1

    for d in sorted(dyr_liste):
        print(d + " : " + str(dyr_liste[d]))



inn3 = input()
zoo(inn3)
