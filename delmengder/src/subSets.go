package main

import (
   "os"
   "strconv"
   "fmt"
   "math"
)

func main() {
   in, _ := strconv.Atoi(os.Args[1])
   length, _ := strconv.Atoi(os.Args[2])
   tot := math.Pow(2,float64(in))

   if length >= in {
      fmt.Println(tot)
   } else {
      fmt.Println(strconv.FormatFloat(facChoos(float64(in), float64(length)), 'f', -1, 64))
   }
}

func fac(n float64) float64 {
   if n <= 1 {
      return 1
   }
   return n * fac(n-1)
}

func choos(n float64, r float64) float64 {
   if n < r {
      return 0
   }
   return fac(n)/(fac(r)*fac(n-r))
}

func facChoos(n float64, r float64) float64 {
   if n < r {
      return 0
   }
   if r == 0 {
      return 1
   }
   return choos(n, r) + facChoos(n, r-1)
}

