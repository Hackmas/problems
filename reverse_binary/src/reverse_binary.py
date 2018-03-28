def reverse_binary(num):
    binary = bin(num)
    bin_string = str(binary)
    bin_string = bin_string[::-1]
    bin_string = bin_string[:-2]

    res = int(bin_string, base=2)
    res = int(res)
    print(res)

num = input()
reverse_binary(int(num))
