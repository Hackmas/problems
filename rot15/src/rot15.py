def rot15(word):
    char_list = {'a':'p', 'b':'q', 'c':'r','d':'s','e':'t','f':'u','g':'v','h':'w',
    'i':'x','j':'y','k':'z','l':'a','m':'b','n':'c', 'o':'d',
    'p':'e','q':'f','r':'g','s':'h','t':'i','u':'j','v':'k','w':'l','x':'m','y':'n','z':'o', ' ': ' '}

    res = ''
    for char in word:
        if char.lower() not in char_list:
            print('illegal character in input')
            return
        res += char_list[char.lower()]

    print(res)


word = input()
rot15(word)
