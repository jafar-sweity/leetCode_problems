/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {

     intervals.sort((a,b)=> a[0]-b[0]);
     let res =[];

     res.push([intervals[0][0],intervals[0][1]]);

     let last_num 
     let curent_pos 
     let end_pos 
     let prev_endPos;

     for (let i = 1; i < intervals.length; i++) {
        last_num = res[res.length - 1];

        curent_pos = intervals[i][0];
        end_pos = intervals[i][1];
        prev_endPos = last_num[1];

        if (prev_endPos >= curent_pos) {
            res[res.length - 1][1] = Math.max(end_pos, prev_endPos);
        } else {
            res.push([curent_pos, end_pos]);
        }
    }
    return res;

};
