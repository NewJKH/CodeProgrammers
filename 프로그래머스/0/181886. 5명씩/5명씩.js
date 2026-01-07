function solution(names) {
    var answer = [];
    for ( let i = 0; i < names.length; i+=5){
        var name = names[i];
        answer.push(name);
    }
    return answer;
}