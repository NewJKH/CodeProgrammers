function solution(n){
    var answer = 0;
    for ( let val of n.toString() ){
        answer += Number(val);
    }
    return answer;
}