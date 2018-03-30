def no_repetitions(words):
    word_list = words.split()
    l = []
    for w in word_list:
        if w.lower() in l:
            print("NEI")
            return
        l.append(w.lower())

    print("JA")


words = input()
no_repetitions(words)
