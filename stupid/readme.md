# Stupid

Sorting isn't trivial when we have binary numbers. We can sort as the value in decimal
 ~1 2 3 ... ~

 or as what we are going to do here.

 If we sort the binary numbers by the values at lsb -> msb we get this:

  00000001
  00000011
  00000101
  00000111
  00001001
  00001011
  00001101
  00001111
  ...
  11111111 -255
  00000010 -2
  00000110

The input is ~n~ hexadecimal numbers

the ouput is the hexadecimal numbers sorted with the above sorting method.

Example:

  10    -00010000
  ff    -11111111
  09    -00001001
  0A    -00001010

output
  09
  0A
  FF
  10
