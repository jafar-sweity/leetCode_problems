class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows ==1:
            return s
        direction =False 
        res = ""
        for i in range(numRows):
            jump = 2 * (numRows-1)
            for j in range (i,len(s),jump):
                res +=s[j]
                if (i>0 and i<numRows -1 and j+jump-2*i<len(s)):
                    res +=s[j+jump-2*i]

        return res
