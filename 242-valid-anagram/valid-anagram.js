/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
let s2 = s.split('').sort().join('');
let s1 = t.split('').sort().join('');
    if(s2==s1)
    return true;
    else
    return false;
     
    
};