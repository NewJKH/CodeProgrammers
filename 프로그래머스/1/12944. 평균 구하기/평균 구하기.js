function solution(arr) {
    var answer = 0;
    var len = arr.length;
    for ( let i of arr ){
        answer+=i;
    }
    return answer/len;
}