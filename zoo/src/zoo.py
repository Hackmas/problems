def zoo(liste):
    dyr = liste.split('\n')
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



#inn = "African elephant\nWhite tiger\nIndian elephant\nSiberian tiger\nTiger\nPanda bear"
#zoo(inn)

#inn2 = "stor gris\nmedium gris\nsnill hest\nkalkun\nbritisk sau\nsvart sau"
#zoo(inn2)

inn3 = "blaa meis\nhvit afrikansk maake\ngul sel\nelefant sel"
zoo(inn3)
