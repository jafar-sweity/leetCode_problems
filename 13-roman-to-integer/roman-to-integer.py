class Solution(object):
    def romanToInt(self, s):
        count =0
        roman={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        for i in range(len(s)) :
            s = s.replace("IV", "IIII").replace("IX", "VIIII")
            s = s.replace("XL", "XXXX").replace("XC", "LXXXX")
            s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        for c in s:
            count += roman[c]
        return count


        