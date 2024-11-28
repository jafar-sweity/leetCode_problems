/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stk=[]

    for (let i=0;i<s.length;i++)
    {
        if (s[i]==='('||s[i]==='{'||s[i]==='[')
        {
            stk.push(s[i]);
        }

        else {
            let last=stk.pop();
            
            if (
             (s[i]===')'&&last!=='(') ||
             (s[i]==='}'&&last!=='{') || 
             (s[i]===']'&&last!=='[') )
            {
            return false; 
            }
        }

    }
        return stk.length===0;

};