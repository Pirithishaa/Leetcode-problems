class Solution:
    def searchMatrix(self, m: List[List[int]], t: int) -> bool:
        row=len(m)
        col=len(m[0])
        for i in range(row):
            for j in range(col):
                if m[i][j]==t:
                    return True
        return False

        