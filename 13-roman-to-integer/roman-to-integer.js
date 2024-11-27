/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    
   s= s.replace("IX","IVV").replace("IV","IIII").replace("V","IIIII");
   s= s.replace("XC","XLL").replace("XL","XXXX");
   s= s.replace("CM","CDD").replace("CD","CCCC");
   let ret=0
   for (let j=0;j<s.length;j++)
   {

    i = s[j];
    if(i=='I')
    {
        ret =ret+1;
    }
    else if (i=="X")
    {
        ret=ret+10
    }
    else if (i=="L")
    {
        ret=ret+50

    }
    else if (i=="C")
    {
        ret=ret+100

    }
    else if (i=='D')
    {
             ret=ret+500
   
    }
    else if (i=='M')
    {
        ret=ret+1000
    }
   }
   return ret;
};