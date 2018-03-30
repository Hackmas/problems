#!/bin/python3

import sys

def check_cavity(x,y,grid):
    
    cur_depth = grid[x][y]
    
    up      = grid[x][y-1] < cur_depth
    down    = grid[x][y+1] < cur_depth 
    left    = grid[x+1][y] < cur_depth
    right   = grid[x-1][y] < cur_depth
    
    return up and down and left and right

n = int(input().strip())
grid = []
cavities = []
grid_i = 0
for grid_i in range(n):
    grid_t = str(input().strip())
    grid.append(grid_t)

for x in range(1,n-1):
    for y in range(1,n-1):
        if check_cavity(x,y,grid):
            cavities.append((x,y))

for point in cavities:
    x,y = point
    temp_lst = list(grid[x])
    temp_lst[y] = 'X'
    grid[x] = ''.join(temp_lst)
    
for line in grid:
    print(line)