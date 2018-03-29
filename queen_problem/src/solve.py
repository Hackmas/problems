COLS = "abcdefgh"
ROWS = "12345678"

THREATS = {c + r: set(
    [c + ROWS[k] for k in range(8)] +
    [COLS[k] + r for k in range(8)] +
    [COLS[k] + ROWS[i - j + k] for k in range(8) if 0 <= i - j + k < 8] +
    [COLS[k] + ROWS[- k + i + j] for k in range(8) if 0 <= - k + i + j < 8])
           for i, r in enumerate(ROWS) for j, c in enumerate(COLS)}

def invalid_queens(placed):
    for p in placed:
        if any( pl in THREATS[p] for pl in placed if pl != p ):
            return True
    return False

def get_first_row_not_occupied(placed):
    occupied_rows = [x[1] for x in placed]
    for r in ROWS:
        if r not in occupied_rows: return r
    return str(len(ROWS)+1) # all rows are occupied

def place_queens(placed):
    res = set()
    if invalid_queens(placed): return res

    row = get_first_row_not_occupied(placed)
    if int(row) > len(ROWS):
        res = placed
    else:
        for col in COLS:
            res = place_queens(placed.union({col+row}))
            if res: break;

    return res