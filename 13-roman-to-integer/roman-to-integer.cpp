class Solution {
public:
    int romanToInt(string s) {
        int count =0;
        unordered_map<char, int> roman_dict = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
        };
        int prev_value=0;
        for(char c:s)
        {
           int  current_value=roman_dict[c];
            if (current_value > prev_value) {
            count += current_value - 2 * prev_value;
        } else {
            count += current_value;
        }
        prev_value = current_value;

        }
        return count;
    };
        
    
};